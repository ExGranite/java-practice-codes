import static java.lang.System.*;
import java.util.*;
public class Task04 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int[] a = new int[5];
        out.println("Please enter 5 numbers:");
        for ( int i = 0; i < a.length; ++i )
            a[i] = scanner.nextInt();
        for ( int c = 0; c < a.length; ++c ) {
            int min = a[c], indexMin = c;
            for ( int i = c + 1; i < a.length; ++i ) {
                if ( a[i] < min ) {
                    min = a[i];
                    indexMin = i;
                }
            }
            int temp = a[c];
            a[c] = min;
            a[indexMin] = temp;
        }
        for ( int i = 0; i < a.length; ++i ) {
            out.print(a[i]);
            if ( i != a.length - 1 )
                out.print(", ");
        }
        out.println();
    }
}