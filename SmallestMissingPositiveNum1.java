import java.util.*;
public class SmallestMissingPositiveNum1 {
    public static int SmallestPositiveMissingNumber(int[] arr){
    int size=arr.length;
 int found;
 for (int i = 1; i < size + 1; i++){
 found = 0;
 for (int j = 0; j < size; j++){
 if (arr[j] == i){
 found = 1;
 break;
 }
 }
 if (found == 0)
 return i;
 }
 return -1;
}
public static void main(String[]args){
    Scanner ac=new Scanner(System.in);
    System.out.println("enter the array size :");
    int n=ac.nextInt();
    System.out.println("enter the array element:");
    int arr[]=new int[n];
    for(int i=0;i<arr.length;i++){
        arr[i]=ac.nextInt();
    }
   System.out.println("print = "+SmallestPositiveMissingNumber( arr));
}
}