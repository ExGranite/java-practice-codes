import static java.lang.System.*;
import java.util.*;
public class Problem20 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter height of triangle: ");
        int height = scanner.nextInt();
        int space = height;
        for ( int row = 1; row <= height; ++row) {
            for (int c = 1; c < space; ++c)
                out.print(" ");
            if ( row == 1 || row == height ) {
                for (int i = 1; i <= (2 * row -1) ; ++i)
                    out.print("*");
                out.println();
            } else {
                for ( int i = 1; i <= (2 * row -1) ; ++i) {
                    if (i == 1 || i == (2 * row -1))
                        out.print("*");
                    else
                        out.print(" ");
                }
                out.println();
            }
            space -= 1;
        }
    }
}