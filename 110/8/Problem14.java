import static java.lang.System.*;
import java.util.*;
public class Problem14 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter length: ");
        int length = scanner.nextInt();
        out.print("Please enter width: ");
        int width = scanner.nextInt();
        for ( int i = 1; i <= length; ++i) {
            if ( i == 1 || i == length ) {
                for ( int c= 1; c <= width; ++c)
                    out.print("*");
                out.println();
            } else {
                for ( int c = 1; c <= width; ++c ) {
                    if ( c == 1 || c == width )
                        out.print("*");
                    else
                        out.print(" ");
                }
                out.println();
            }
        }
    }
}