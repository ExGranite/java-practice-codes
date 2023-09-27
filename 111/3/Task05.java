import static java.lang.System.*;
import java.util.*;
public class Task05 {
  public static void main (String[] OK) {
    Scanner scanner = new Scanner (in);
    out.print("Please enter a string: ");
        String s = scanner.next();
        out.printf("%s%n%s==THE END==%n%s%n", s, s, s);
    scanner.close();
  }
}