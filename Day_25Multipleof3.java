import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String N = scanner.next();
int digitSum = 0;
for (int i = 0; i < N.length(); i++) {
digitSum += Character.getNumericValue(N.charAt(i));
}
if (digitSum % 3 == 0) {
System.out.println(0);
return;
}
int count = 0;
for (int i = 0; i < N.length(); i++) {
if ((digitSum - Character.getNumericValue(N.charAt(i))) % 3 == 0) {
System.out.println(1);
return;
}
for (int j = i + 1; j < N.length(); j++) {
 if ((digitSum - Character.getNumericValue(N.charAt(i)) - Character.getNumericValue(N.charAt(j))) % 3 == 0) {
System.out.println(2);
return;
}
}
}
        System.out.println(-1);
}
}
