import static java.lang.System.*;
import java.util.*;
public class Task28 {
     public static void main (String[] args) {
           Scanner scanner = new Scanner (in);
           System.out.print("Please enter number: ");
           int num = scanner.nextInt();
           int sum = 0;
           for ( int i = 1; i <= num; ++i)
               if (num%i==0)
                   sum += i;
           System.out.printf("Sum of factors: %d%n", sum);
     }
}