import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    sc.close();

    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      char c = (char) (((s.charAt(i) - 'A' + n) % 26) + 'A');
      sb.append(c);
    }
    System.out.println(sb.toString());
  }
}
