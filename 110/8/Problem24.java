import static java.lang.System.*;
import java.util.*;
public class Problem24 {
     public static void main (String[] args) {
          Scanner scanner = new Scanner (in);
          out.print("Please enter number: ");
          int num = scanner.nextInt();
          for ( int i = 1; i <= num; ++i)
              out.print(i);
          for ( int i = num - 1; i > 0; --i )
              out.print(i);
          out.println();
     }
}