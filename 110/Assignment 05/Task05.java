import static java.lang.System.*;
import java.util.*;
public class Task05 {
     public static void main (String[] args) {
          Scanner scanner = new Scanner (in);
          int[] a = new int[] {50, 30, 20, 10, 40};
          int max = a[1], temp = a[1];
          for ( int i = 1; i <= 4; ++i )
              if ( a[i] > max )
                  max = a[i];
          for ( int i = 1; i <= 4; ++i )
              if ( max == a[i] )
                  a[i] = temp;
          a[1] = max;
          System.out.print("a: ");
          for ( int i = 0; i <= 4; ++i) {
              System.out.print(a[i]);
              if ( i!=4 )
                  System.out.print(", ");
          }
          System.out.println();
     }
}