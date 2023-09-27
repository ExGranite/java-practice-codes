import static java.lang.System.*;
import java.util.*;
public class Task09 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(in);
        int[] a = new int[15];
        out.println("Please enter 15 numbers between 0 and 9:");
        for ( int i = 0; i < a.length; ++i ) {
            a[i] = scanner.nextInt();
            boolean check = true;
            while ( check == true ) {
                if ( a[i] < 0 || a[i] > 9 ) {
                    out.print("Please make sure the number is between 0 and 9: ");
                    a[i] = scanner.nextInt();
                    continue;
                } else {
                    check = false;
                }
            }
        }
        for ( int i = 0; i < a.length; ++i ) {
            for ( int printCount = 1; printCount <= a[i]; ++printCount ) {
                out.print(a[i]);
                if ( printCount != a[i] )
                    out.print(", ");
            }
            out.println();
        }
    }
}