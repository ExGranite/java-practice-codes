import static java.lang.System.*;
import java.util.*;
public class Task13 {
     public static void main (String[] args) {
          Scanner scanner = new Scanner (in);
          int[] num = new int[10];
          for ( int i= 0; i < num.length; ++i ) {
            out.print("Please enter number: ");
            num[i] = scanner.nextInt();
          }
          int sumOdd = 0, sumEven = 0, sumDiv5 = 0;
          for ( int i = 0; i < num.length; ++i ) {
            if ( num[i] % 2 == 0 )
              sumEven += num[i];
            else
              sumOdd += num[i];
            if ( num[i] % 5 == 0 )
              sumDiv5 += num[i];
          }
          out.printf("Summation of odd numbers: %d%nSummation of even numbers: %d%nSummation of numbers divisible by 5: %d%n", sumOdd, sumEven, sumDiv5);
     }
}