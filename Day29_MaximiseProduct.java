import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
 
        long max1 = a * d;
        long max2 = b * c;
        long MAX1 = Math.max(max1,max2);
 
        long max3 = a * c;
        long max4 = b * d;
        long MAX2 = Math.max(max3,max4);
 
        System.out.println(Math.max(MAX1,MAX2));
    }
}
