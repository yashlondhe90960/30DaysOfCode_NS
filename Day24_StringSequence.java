import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 26; i++){
            int p = sc.nextInt();
            System.out.print((char)(p + 96));
        }
    }
}
