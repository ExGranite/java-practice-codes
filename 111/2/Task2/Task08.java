import static java.lang.System.*;
import java.util.*;
public class Task08 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (in);
        int[] a = new int[10];
        out.println("Please enter 10 numbers within 0 to 9:");
        for (int i = 0; i < a.length; ++i)
            a[i] = sc.nextInt();
        int i = 0;
        for ( ; i < a.length; ++i) {
            int c = 1;
            for (int j = i+1; j < a.length; ++j) {
                if (a[j] == a[i])
                    ++c;
            }
            if (c>=2 && c<5) {
                out.println(a[i]);
            }
        }
        sc.close();
    }
}