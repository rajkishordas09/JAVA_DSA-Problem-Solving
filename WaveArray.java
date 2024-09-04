import java.util.*;
public class WaveArray {
    public static void WaveArray2(int[] arr){
        int size = arr.length;
        /* Odd elements are lesser then even elements. */
        for ( int i = 1 ;i < size; i+= 2){
        if ((i - 1) >= 0 && arr[i] > arr[i - 1]){
       Reverse(arr, i, i-1);
       
        }
        if ((i + 1) < size && arr[i] > arr[i + 1]){
       Reverse(arr, i, i+1);
        }} }
       public static void Reverse(int arr[],int f,int l){
        for(int i=f,j=l;i<j;i++,j--){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }}
       public static void main(String[]args){
        Scanner ac=new Scanner(System.in);
        System.out.println("enter the array size :");
        int n=ac.nextInt();
        System.out.println("enter the array element:");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=ac.nextInt();
        }
        WaveArray2(arr);
        System.out.println("print array = ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

       }
}
