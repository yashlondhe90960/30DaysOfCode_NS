import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        long t=c*d-b;
        if (t<=0) System.out.println(-1);
        else{
            if (a%t==0) System.out.println(a/t);
            else System.out.println(a/t+1);
        }
    }
}
