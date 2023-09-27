import static java.lang.System.*;
import java.util.*;
public class Problem11 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter number: ");
        int height = scanner.nextInt();
        int space = height;
        for (int row = 1; row <= height; ++row) {
            for (int s = 1; s <= (space - 1); ++s)
                out.print(" ");
            for (int c = 1; c <= height; ++c) {
                int result = height - row + c;
                out.print((height - row + c));
                if (result == height)
                    break;
            }
            out.println();
            space -= 1;
        }
    }
}