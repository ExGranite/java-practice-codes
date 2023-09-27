import static java.lang.System.*;
import java.util.*;
public class Task04example {
  public static void main (String[] OK) {
    Scanner scanner = new Scanner (in);
    int[] a = new int[3];
    out.println("Please enter 8 numbers between 2 and 4:");
    for (int i = 0; i <= 7; ++i) {
        int n = scanner.nextInt();
        ++a[n - 2];
    }
    for (int i=0; i <= 2; ++i)
        out.printf("%d was found %d time(s)%n", i+2, a[i]);
    scanner.close();
  }
}