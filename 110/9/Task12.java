import static java.lang.System.*;
import java.util.*;
public class Task12 {
     public static void main (String[] args) {
          Scanner scanner = new Scanner (in);
          int[] num = new int[10];
          for ( int i= 0; i < num.length; ++i ) {
            out.print("Please enter number: ");
            num[i] = scanner.nextInt();
          }
          for ( int i= 9; i >= 0; --i ) {
            if ( num[i] % 2 == 0 ) {
              out.printf("The even number %d is in the position %d.%n", num[i], i);
            }
          }
     }
}