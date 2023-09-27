import static java.lang.System.*;
import java.util.*;
public class Task09 {
     public static void main (String[] args) {
          Scanner scanner = new Scanner (in);
          int[] num = new int[10];
          for ( int i= 0; i < num.length; ++i ) {
            out.print("Please enter number to store: ");
            num[i] = scanner.nextInt();
          }
          out.print("Please enter a number to check: ");
          int checkNum = scanner.nextInt();
          boolean found = false;
          for ( int i= 0; i < num.length; ++i ) {
//            if ( checkNum == num[i] ) {
//              out.println("Yes");
//              break;
//            }
//            else if ( i == (num.length-1) )
//              out.println("No");
//            else
//              continue;
            if ( checkNum == num[i] )
              found = true;
          }
          if ( found == true )
            out.println("Yes");
          else
            out.println("No");
     }
}