import static java.lang.System.*;
import java.util.*;
public class Task08 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int[] a = new int[10];
        out.println("Please enter 10 numbers:");
        for (int i = 0; i < a.length; ++i) {
            a[i] = scanner.nextInt();
            for (int j = 0; j < i; ++j) {
                if (a[j] == a[i]) {
                    out.printf("The number %d has already been entered. Please enter a new number: ", a[i]);
                    a[i] = scanner.nextInt();
                    j = -1;
                    continue;
                }
            }
        }
        scanner.close();
    }
}