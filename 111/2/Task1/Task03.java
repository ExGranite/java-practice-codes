import static java.lang.System.*;
import java.util.*;
public class Task03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(in);
        int[] a = new int[10];
        out.println("Please enter 10 numbers:");
        for (int i = 0; i < a.length; ++i)
            a[i] = sc.nextInt();
        for (int i = a.length-1; i > 0; --i) {
            out.printf("%d, ", a[i]);
        }
        out.println(a[0]);
        sc.close();
    }
}