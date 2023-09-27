import static java.lang.System.*;
import java.util.*;
public class Task26 {
     public static void main (String[] args) {
           Scanner scanner = new Scanner (in);
           System.out.print("Please enter number: ");
           int num = scanner.nextInt();
           int count = 0;
           for ( int i = 1; i <= num; ++i)
               if (num%i==0)
                   ++count;
           if (count==2)
               System.out.printf("%d is a prime number%n", num);
           else
               System.out.printf("%d is not a prime number%n", num);
     }
}