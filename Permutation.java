public class Permutation {
    public static void permutation(int[] arr, int i, int length) {
        if (length == i) {
       printArray(arr);
        return;
        }
        int j = i;
        for (j = i; j < length; j++) {
       swap(arr, i, j);
       permutation(arr, i + 1, length);
       swap(arr, i, j);
        }
        return;
       }
       public static void swap(int arr[],int m,int n){
        int x=n;
        for(int i=0;i<arr.length;i++){
        int temp=arr[m];
        arr[m]=arr[n];
        arr[n]=temp;
        }
        
        }
        public static void printArray(int arr[]){
            for(int i=0;i<arr.length;i++){
                System.out.println("print"+arr[i]);
            }

       }
       public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
        arr[i] = i;
        }
        permutation( arr, i,  arr.length);

}}
