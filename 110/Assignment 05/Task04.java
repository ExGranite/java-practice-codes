import static java.lang.System.*;
import java.util.*;
public class Task04 {
     public static void main (String[] args) {
          Scanner scanner = new Scanner (in);
          int[] a = new int[] {10, 30, 20, 50, 40};
          int max = a[0], temp = a[0];
          for ( int i = 0; i <= 4; ++i )
              if ( a[i] > max )
                  max = a[i];
          for ( int i = 0; i <= 4; ++i )
              if ( max == a[i] )
                  a[i] = temp;
          a[0] = max;
          System.out.print("a: ");
          for ( int i = 0; i <= 4; ++i) {
              System.out.print(a[i]);
              if ( i!=4 )
                  System.out.print(", ");
          }
          System.out.println();
     }
}