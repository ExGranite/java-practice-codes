import static java.lang.System.*;
import java.util.*;
public class Task09 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int[] a = new int[10];
        out.println("Please enter 10 numbers:");
        for ( int i = 0; i < a.length; ++i )
            a[i] = scanner.nextInt();
        int location = 0;
        for ( int c = 0; c < a.length; ++c ) {
            if ( a[c] %2 != 0 ) {
                int min = a[c], indexMin = c;
                for ( int i = c + 1; i < a.length; ++i ) {
                    if ( a[i] < min ) {
                        min = a[i];
                        indexMin = i;
                    }
                }
                int temp = a[location];
                a[location] = min;
                a[indexMin] = temp;
                ++location;
            }
        }
        for ( int c = 0; c < a.length; ++c ) {
            if ( a[c] %2 == 0 ) {
                int min = a[c], indexMin = c;
                for ( int i = c + 1; i < a.length; ++i ) {
                    if ( a[i] < min ) {
                        min = a[i];
                        indexMin = i;
                    }
                }
                int temp = a[location];
                a[location] = min;
                a[indexMin] = temp;
                ++location;
            }
        }
        int i = 0;
        for ( ; i < a.length - 1; ++i )
            out.printf("%d, ", a[i]);
        out.println(a[i]);
        scanner.close();
    }
}