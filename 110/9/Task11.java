import static java.lang.System.*;
import java.util.*;
public class Task11 {
     public static void main (String[] args) {
          Scanner scanner = new Scanner (in);
          int[] num = new int[10];
          for ( int i = 0; i < num.length; ++i ) {
            out.print("Please enter a number: ");
            num[i] = scanner.nextInt();
            for ( int count = 0; count < i; ++count ) {
              if ( num[count] == num[i] ) {
                out.print("Number has already been entered. Please re-enter another number: ");
                num
                  [i] = scanner.nextInt();
                count = -1;
                continue;
              }
            }
          }
     }
}
/* boolean found = false
 * for
 * if ( num[count] == num[i] )
 * found = true
 * 
 * if ( found == true )
 * 
 * else
*/
  