import static java.lang.System.*;
import java.util.*;
public class Problem17 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter a number: ");
        int quantity = scanner.nextInt();
        for ( int i = 1; i <= quantity; ++i) {
            if ( i == 1 || i == quantity ) {
                for ( int c = 1; c <= i ; ++c)
                    out.print(c);
                out.println();
            } else {
                for ( int c = 1; c <= i; ++c ) {
                    if ( c == 1 || c == i )
                        out.print(c);
                    else
                        out.print(" ");
                }
                out.println();
            }
        }
    }
}