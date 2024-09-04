import java.util.Scanner;
public class RotateArray1{
public static void rotateArray(int[] a,  int k) {
    int n=a.length;
    reverseArray(a, 0, k - 1);
    reverseArray(a, k, n - 1);
    reverseArray(a, 0, n - 1);
    }
    public static void reverseArray(int[] a, int start, int end) {
    for (int i = start, j = end; i < j; i++, j--) {
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
    }}
    public static void  printArray(int arr[]){
        System.out.println("print rotate array :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+"");
        }}
    public static void main (String []args){
        Scanner ac=new Scanner(System.in);
        System.out.println("enter the array size :");
        int n=ac.nextInt();
        System.out.println("enter the array element:");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=ac.nextInt();
        }
        System.out.println("rotate  element by k position is :");
        int k=ac.nextInt();
       rotateArray(arr,k);
       printArray(arr);
}
}