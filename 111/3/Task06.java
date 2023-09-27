import static java.lang.System.*;
import java.util.*;
public class Task06 {
    public static void main (String[] OK) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter a string: ");
        String s = scanner.next();
//        out.println(s);
//        out.println(s.concat("==THE END=="));
//        out.println(s);
        out.println(s.concat("\n"+s.concat("==THE END==\n".concat(s))));
        scanner.close();
    }
}