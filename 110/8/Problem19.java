import static java.lang.System.*;
import java.util.*;
public class Problem19 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter a number: ");
        int quantity = scanner.nextInt();
        for ( int i = 1; i <= quantity; ++i) {
            for ( int s = 1; s <= (quantity - i); ++s)
                out.print(" ");
            if ( i == 1 || i == quantity ) {
                for ( int c = 1; c <= i; ++c ) {
                    out.print(quantity - i + c);
                    if (quantity - i + c == quantity)
                        break;
                }
                out.println();
            } else {
                for ( int c = 1; c <= i ; ++c) {
                    if ( c == 1 || c == i ) {
                        out.print(quantity - i + c);
                        if (quantity - i + c == quantity)
                            break;
                    } else 
                        out.print(" ");
                }
                out.println();
            }
        }
    }
}