import java.util.Scanner;
public class SmallestPositiveMissingNum3 {
    public static int SmallestPositiveMissingNum3(int[] arr)
{
    int size=arr.length;
 int temp;
 for (int i = 0; i < size; i++)
 {
 while (arr[i] != i + 1 && arr[i] > 0 && arr[i] <= size)
 {
 temp = arr[i];
 arr[i] = arr[temp - 1];
 arr[temp - 1] = temp;
 }
 }
 for (int i = 0; i < size; i++)
 {
 if (arr[i] != i + 1)
 return i + 1;
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
   System.out.println("print = "+SmallestPositiveMissingNum3( arr));


   }
}