import static java.lang.System.*;
import java.util.*;
public class Problem25 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter number: ");
        int num = scanner.nextInt();
        int space = num;
        for ( int row = 1; row <= num; ++row) {
            for ( int c = 1; c < space; ++c)
                out.print(" ");
            for ( int i = 1; i <= row; ++i)
                out.print(i);
            for ( int i = row - 1; i > 0; --i )
                out.print(i);
            out.println();
            space -= 1;
        }
    }
}