public class TawarOfHanoi {
    public static void towerOfHanoi(int num, char s, char d, char temp) {
        if (num < 1) {
        return;
        }
       towerOfHanoi(num - 1, s, temp, d);
        System.out.println("Move " + num + " disk from peg " + s + " to peg " + d);
       towerOfHanoi(num - 1, temp, d, s);
       }
       public static void main(String[] args) {
        int num = 4;
        System.out.println("The sequence of moves are :\n");
        towerOfHanoi(num, 'A', 'C', 'B');
}
 
}
