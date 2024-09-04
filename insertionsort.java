import java.util.Scanner;
public class insertionsort {
        public static void sort(int[] arr) {
            int n = arr.length;
            for (int i = 1; i < n; ++i) {
                int key = arr[i];
                int j = i - 1;

                while (j >= 0 && arr[j] > key) {
                    arr[j + 1] = arr[j];
                    j = j - 1;
                
                
                }
                arr[j + 1] = key;
            }
        }
        public static void print(int arr[]){
            System.out.println("print array :");
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]+"");
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
            sort(arr);
            print(arr);

        }
    }
 
