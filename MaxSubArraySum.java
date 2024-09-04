import java.util.Scanner;
public class MaxSubArraySum{
public static int maxSubArraySum(int[]arr) {
 int max = 0, maxEnd = 0;
 for (int i = 0; i <arr.length; i++) {
 maxEnd = maxEnd + arr[i];
 if (maxEnd < 0) {
 maxEnd = 0;
 }
 if (max < maxEnd) {
 max = maxEnd;
 }
 }
 return max;
}
public static void main (String[]args){
Scanner ac=new Scanner(System.in);
System.out.println("enter the array size :");
int n=ac.nextInt();
System.out.println("enter the array element:");
int arr[]=new int[n];
for(int i=0;i<arr.length;i++){
    arr[i]=ac.nextInt();
}
System.out.println("print = "+maxSubArraySum(arr));
}
}