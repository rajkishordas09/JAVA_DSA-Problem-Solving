import java.util.Scanner;
public class LinearSearch {
public static int LinearSearch1(int x1,int arr[]){
    
    for(int i=0;i<arr.length;i++){
       if(arr[i]==x1)
       return i; 
    }
       return -1;
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
        System.out.println("put the find Element :");
        int x=ac.nextInt();
        System.out.println("print the Index of Search element is:"+LinearSearch1(x,arr));


}
}