import static java.lang.System.*;
import java.util.*;
public class Problem8 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter a number: ");
        int quantity = scanner.nextInt();
        for ( int i = 1; i <= quantity; ++i) {
            for ( int s = 1; s <= (quantity - i); ++s)
                out.print(" ");
            for ( int c = 1; c <= i ; ++c)
                out.print(c);
            out.println();
        }
    }
}