import static java.lang.System.*;
import java.util.*;
public class Problem2 {
     public static void main (String[] args) {
          Scanner scanner = new Scanner (in);
          out.print("Please enter number: ");
          int quantity = scanner.nextInt();
          for ( int i = 1; i <= quantity; ++i)
            out.print("*");
          out.println();
     }
}