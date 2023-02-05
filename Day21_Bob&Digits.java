import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int c=0;
        while(N>=1){
            int rem=N%K;
            c=c+1;
            N=N/K;
        }
        System.out.println(c);
    }
}
