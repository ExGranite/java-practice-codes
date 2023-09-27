import static java.lang.System.*;
import java.util.*;
public class Task25 {
     public static void main (String[] args) {
           Scanner scanner = new Scanner (in);
           System.out.print("Please enter number: ");
           int num = scanner.nextInt();
           int count = 0;
           for ( int i = 1; i <= num; ++i)
               if (num%i==0)
                   ++count;
           System.out.printf("%d can be divided %d times by all numbers up to %d%n", num, count, num);
     }
}