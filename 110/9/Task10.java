import static java.lang.System.*;
import java.util.*;
public class Task10 {
     public static void main (String[] args) {
          Scanner scanner = new Scanner (in);
          int[] num = new int[10];
          for ( int i = 0; i < num.length; ++i ) {
            out.print("Please enter number: ");
            num [i] = scanner.nextInt();
            for ( int count = 0; count <= i; ++count ) {
              out.print(num[count]);
              if ( count == i )
                break;
              out.print(", ");
            }
            out.println();
          }
     }
}