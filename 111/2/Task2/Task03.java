import static java.lang.System.*;
import java.util.*;
public class Task03 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (in);
        int[] a = new int[10];
        out.println("Please enter 10 numbers:");
        for (int i = 0; i < a.length; ++i)
            a[i] = sc.nextInt();
        for (int i = 0; i < a.length-1; ++i) {
            for (int j = i+1; j < a.length; ++j) {
                if (a[j] > a[i]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        int j = 0;
        for ( ; j < a.length-1; ++j) {
            out.printf("%d, ", a[j]);
        }
        out.println(a[j]);
        sc.close();
    }
}