import static java.lang.System.*;
import java.util.*;
public class Problem3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter the numbder of rows: ");
        int row = scanner.nextInt();
        out.print("Please enter the number of columns: ");
        int column = scanner.nextInt();
        for ( int c = 1; c <= row; ++c) {
            for ( int i = 1; i <= column; ++i)
                out.print("*");
            out.println();
        }
    }
}