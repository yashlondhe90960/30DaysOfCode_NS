import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        int K = sc.nextInt();
        for (int i = 0; i < K; i++) {
            if(N % 200 == 0){
                N /= 200;
            } else {
                N *= 1000;
                N += 200;
            }
        }
        System.out.println(N);
    }
}
