import static java.lang.System.*;
import java.util.*;
public class Task06 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int[] a = new int[15];
        out.println("Please enter 15 numbers within the range 0-9:");
        for (int i = 0; i < a.length; ++i) {
            a[i] = scanner.nextInt();
            for (int j = 0; j < 1; ++j) {
                if (a[i]>9 || a[i]<0) {
                    out.print("The number has has to be within the range 0-9. Please enter a new number: ");
                    a[i] = scanner.nextInt();
                    j = -1;
                    continue;
                }
            }
        }
        for (int i = 0; i < a.length; ++i) {
            for (int j = 1; j < a[i]; ++j) {
                out.printf("%d, ", a[i]);
            }
            if (a[i] != 0) {
                if (i == a.length-1)
                    out.println(a[i]);
                else
                    out.printf("%d, ", a[i]);
            }
        }
        scanner.close();
    }
}