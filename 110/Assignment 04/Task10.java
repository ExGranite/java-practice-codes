import static java.lang.System.*;
import java.util.*;
public class Task10 {
     public static void main (String[] args) {
           Scanner scanner = new Scanner (in);
           int count = 0, sum = 0;
           for ( int num = 1; num<=10; ++num) {
               System.out.print("Please enter number: ");
               int n1 = scanner.nextInt();
               if (n1%2!=0) {
                   sum += n1;
                   ++count;
               }
           }
           double avg = (1.0 * sum)/count;
           System.out.printf("Average: %.2f%nSum: %d%n", avg, sum);
     }
}