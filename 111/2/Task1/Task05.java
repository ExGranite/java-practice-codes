import static java.lang.System.*;
import java.util.*;
public class Task05 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int[] a = new int[10];
        out.println("Please enter 10 numbers:");
        for (int i = 0; i < a.length; ++i)
            a[i] = scanner.nextInt();
        out.print("Please enter the new number: ");
        int b = scanner.nextInt();
        for (int i = 0; i < a.length; ++i) {
            if (b == a[i]) {
                out.println("Yes");
                break;
            } else if (i == a.length-1)
                out.println("No");
        }
        scanner.close();
    }
}