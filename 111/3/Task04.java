import static java.lang.System.*;
import java.util.*;
public class Task04 {
    public static void main (String[] OK) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter a string using capital alphabets only: ");
        String s = scanner.nextLine();
        int[] a = new int[26];
        for (int i = 0; i < s.length(); ++i)
            ++a[(int)s.charAt(i)-65];
        for (int i=0; i <a.length; ++i)
            out.printf("%c which is in %d was found %d time(s)%n",(char) i+65, i+65, a[i]);
        scanner.close();
    }
}