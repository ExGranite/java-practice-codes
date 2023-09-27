import static java.lang.System.*;
import java.util.*;
public class Task04 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int[] a = new int[20];
        out.println("Please enter 20 numbers:");
        for (int i = 0; i < a.length; ++i)
            a[i] = scanner.nextInt();
        for (int i = a.length-1; i >= 0; --i) {
            if (a[i]%2==0) {
                if (i!=0)
                    out.printf("%d, ", a[i]);
                else
                    out.print(a[0]);
            }
        }
        out.println();
        scanner.close();
    }
}