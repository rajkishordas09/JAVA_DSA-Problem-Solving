import java.util.*;
public class SumArray {
    public static int SumArray1(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }
    public static void main (String []args){
        Scanner ac=new Scanner(System.in);
        System.out.println("enter the array size :");
        int n=ac.nextInt();
        System.out.println("enter the array element:");
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=ac.nextInt();
        }
        //int result=SumArray1(arr);
        System.out.println("print the SumArray is:"+SumArray1(arr));
    }
}
