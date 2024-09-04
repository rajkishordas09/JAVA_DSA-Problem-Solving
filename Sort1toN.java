import java.util.Scanner;
public class Sort1toN {
    public static void Sort1toN(int[] arr)
{
    int n=arr.length;
 int temp;
 for (int i = 0; i <n; i++)
 {
 while (arr[i] != i + 1 && arr[i] > 1)
 {
 temp = arr[i];
 arr[i] = arr[temp - 1];
 arr[temp - 1] = temp;
 }
 }
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
    Sort1toN(arr);
    System.out.println("print = ");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
}
}
}
