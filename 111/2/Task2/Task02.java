import static java.lang.System.*;
import java.util.*;
public class Task02 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (in);
        int[] a = new int[10];
        out.println("Please enter 10 numbers:");
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
            if ( i != a.length ) {
                out.print("You have entered ");
                int j = 0;
                for ( ; j < i; ++j) {
                    out.printf("%d, ", a[j]);
                }
                out.println(a[j]);
            }
        }
        sc.close();
    }
}