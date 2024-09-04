import java.util.Scanner;
public class IndexArray{
 public static void indexArray(int[] arr)
{
    int n=arr.length;
     int temp;
 for (int i = 0; i <n; i++)
 {
 while (arr[i] != -1 && arr[i] != i)
 {
 /* swap arr[i] and arr[arr[i]] */
 temp = arr[i];
 arr[i] = arr[temp];
 arr[temp] = temp;
 }
 }
}
public static void printArray(int arr[]){
    System.out.println("print = ");
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
}
}
/* Testing code */

    public static void main(String[]args){
        Scanner ac=new Scanner(System.in);
        System.out.println("enter the array size :");
        int n=ac.nextInt();
        System.out.println("enter the array element:");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=ac.nextInt();
        }
        indexArray(arr);     
printArray(arr);

    }}