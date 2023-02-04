import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tree[] = new int[n];
        for(int i =0; i < n; i++){
            tree[i] = sc.nextInt();
        }
        int totalNuts = 0;
        for(int i = 0; i < n; i++){
            if(tree[i] > 10){
                totalNuts += (tree[i] - 10);
            }
        }
        System.out.print(totalNuts);
    }
}
