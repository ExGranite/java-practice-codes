import static java.lang.System.*;
import java.util.*;
public class Task03 {
     public static void main (String[] args) {
          Scanner scanner = new Scanner (in);
          int[] a = new int[] {10, 30, 20, 50, 40};
          int max = a[0];
          for ( int i = 0; i <= 4; ++i )
              if ( a[i] > max )
                  max = a[i];
          for ( int i = 0; i <= 4; ++i )
              if ( max == a[i] )
                  System.out.printf("Largest number is %d and was found at the location %d.%n", max, i);
     }
}