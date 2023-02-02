import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long a = sc.nextLong();
        long b = sc.nextLong();

        while(a != 0 && b != 0) {
            if((a % 10) + (b % 10) >= 10) {
                System.out.print("Hard");
                return;
            }
            a = a / 10;
            b = b / 10;
        }
        System.out.print("Easy");
    }
}
