import static java.lang.System.*;
import java.util.*;
public class DD {
    public static void main ( String[] args ) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter the side of the square: ");
        int height = scanner.nextInt();
        for ( int row = 1; row <= height; ++row ) {
            if ( row %2 != 0 ) {
                for ( int column = 1; column <= height; ++column ) {
                    if ( column == 1 || column == height )
                        out.print("A");
                    else
                        out.print("C");
                }
                out.println();
            } else {
                for ( int column = 1; column <= height; ++column ) {
                    if ( column == 1 || column == height )
                        out.print("C");
                    else
                        out.print("A");
                }
                out.println();
            }
        }
    }
}