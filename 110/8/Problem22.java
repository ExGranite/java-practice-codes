import static java.lang.System.*;
import java.util.*;
public class Problem22 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter height of triangle: ");
        int height = scanner.nextInt();
        int space = height;
        for ( int row = 1; row <= height; ++row ) {
            for (int c = 1; c < space; ++c)
                out.print(" ");
            if ( row == 1 ) {
                for ( int i = 1; i <= (2 * row -1) ; ++i)
                    out.print("*");
                out.println();
            } else {
                for ( int i = 1; i <= (2 * row -1) ; ++i) {
                    if ( i == 1 || i == 2 * row -1 )
                        out.print("*");
                    else
                        out.print(" ");
                }
                out.println();
            }
            space -= 1;
        }
        for ( int row = height - 1; row > 0; --row ) {
            for ( int c = 0; c <= space; ++c )
                out.print(" ");
            if ( row == 1 ) {
                for ( int i = 1; i <= (2 * row -1) ; ++i)
                    out.print("*");
                out.println();
            } else {
                for ( int i = 1; i <= (2 * row -1) ; ++i) {
                    if ( i == 1 || i == 2 * row -1 )
                        out.print("*");
                    else
                        out.print(" ");
                }
                out.println();
            }
            space += 1;
        }
    }
}