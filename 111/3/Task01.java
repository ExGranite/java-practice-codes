import static java.lang.System.*;
import java.util.*;
public class Task01 {
    public static void main (String[] OK) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter a string: ");
        String s = scanner.next();
        out.println(s.length());
        scanner.close();
    }
}