import static java.lang.System.*;
import java.util.*;
public class Task01 {
     public static void main (String[] args) {
          Scanner scanner = new Scanner (in);
          int[] num = new int[3];
          int sum = 0;
          for ( int i= 0; i < num.length; ++i ) {
            out.print("Please enter number: ");
            num[i] = scanner.nextInt();
            sum += num[i];
          }
          out.printf("Summation: %d%n", sum);
          for ( int i= 0; i < num.length; ++i )
            out.printf("Number %d: %d%n", (i+1), num[i]);
     }
}