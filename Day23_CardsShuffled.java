import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[n+1];
		
		for(int i=1; i<4*n; i++) {
			arr[Integer.parseInt(st.nextToken())]++;
		}
		for(int i=1; i<arr.length; i++) {
			if(arr[i] == 3) System.out.println(i);
		}
		
 	}
}
