import static java.lang.System.*;
import java.util.*;
public class Task01 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(in);
        int[] a = new int[5];
        out.println("Please enter 5 numbers:");
        for ( int i = 0; i < a.length; ++i )
            a[i] = scanner.nextInt();
        int max = a[0];
        for ( int i = 1; i < a.length; ++i )
            if ( a[i] > max )
                max = a[i];
        out.println(max);
    }
}