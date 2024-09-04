import java.util.*;
public class SmallestPositiveMissingNumber2{
    public static int SmallestPositiveMissingNumber2(int[] arr){
        int size=arr.length;
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        for(int i = 0;i< size; i++) {
        hs.put(arr[i], 1);
        }
        for(int i=1;i< size+1; i++) {
        if (hs.containsKey(i) == false){
        return i;
        }
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
       System.out.println("print = "+SmallestPositiveMissingNumber2( arr));


       }
}