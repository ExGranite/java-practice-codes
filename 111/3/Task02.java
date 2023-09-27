import static java.lang.System.*;
import java.util.*;
public class Task02 {
    public static void main (String[] OK) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter a string: ");
        String s = scanner.next();
        for (int i = 0; i < s.length(); ++i) {
            out.println(s.charAt(i));
        }
        scanner.close();
    }
}