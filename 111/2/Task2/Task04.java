import static java.lang.System.*;
import java.util.*;
public class Task04 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (in);
        int[] a = new int[5];
        out.println("Please enter 5 unique numbers:");
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
            for (int j = 0; j < i; ++j) {
                if (a[j] == a[i]) {
                    out.printf("The number %d has already been entered. Please enter a new number: ", a[i]);
                    a[i] = sc.nextInt();
                    j = -1;
                    continue;
                }
            }
        }
        int i = 0;
        for ( ; i < a.length-1; ++i) {
            out.printf("%d, ", a[i]);
        }
        out.println(a[i]);
        sc.close();
    }
}