import java.util.Scanner;
public class GCD {
    public static int GCD(int m, int n) {
        if (m < n) {
        return (GCD(n, m));
        }
        if (m % n == 0) {
        return (n);
        }
        return (GCD(n, m % n));
       }
       public static void main(String[]args){
        Scanner ac=new Scanner(System.in);
        System.out.println("enter the array size :");
        int m=ac.nextInt(); 
        int n=ac.nextInt();
       System.out.println(GCD( m, n));
}
}