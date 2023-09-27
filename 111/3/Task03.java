import static java.lang.System.*;
import java.util.*;
public class Task03 {
    public static void main (String[] OK) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter a string: ");
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); ++i) {
            int codeForC = s.codePointAt(i);
            out.printf("%c : %d%n", s.charAt(i), codeForC);
        }
        scanner.close();
    }
}