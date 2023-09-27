import static java.lang.System.*;
import java.util.*;
public class Task07 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (in);
        int[] a = new int[11];
        out.println("Please enter 11 numbers:");
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
            int c = 1;
            for (int j = 0; j < i; ++j) {
                if (a[j] == a[i]) {
                    c += 1;
                    if (c > 4) {
                        out.printf("The number %d has already been entered 4 times. Please enter a new number: ", a[i]);
                        a[i] = sc.nextInt();
                        c = 1;
                        j = -1;
                    }
                }
                continue;
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