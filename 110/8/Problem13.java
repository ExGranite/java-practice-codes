import static java.lang.System.*;
import java.util.*;
public class Problem13 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter height of triangle: ");
        int height = scanner.nextInt();
        int space = height;
        for ( int row = 1; row <= height; ++row) {
            for (int c = 1; c < space; ++c)
                out.print(" ");
            for ( int i = 1; i <= (2 * row -1) ; ++i)
                out.print(i);
            space -= 1;
            out.println();
        }
        for ( int row = height - 1; row > 0; --row ) {
            for ( int c = 0; c <= space; ++c )
                out.print(" ");
            for ( int i = 1; i <= (2 * row -1) ; ++i)
                out.print(i);
            space += 1;
            out.println();
        }
    }
}