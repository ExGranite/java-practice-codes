import static java.lang.System.*;
import java.util.*;
public class Task03 {
     public static void main (String[] args) {
           Scanner scanner = new Scanner (in);
           int sum = 0 , num = 2;
           System.out.print("Please enter a number: ");
           int n1 = scanner.nextInt();
           sum += n1;
           while (num <= 20) {
                System.out.print("Please enter a number: ");
                int n2 = scanner.nextInt();
                sum += n2;
                if (n2>n1)
                    n1 = n2;
                ++num;
           }
           double avg = (1.0 * sum)/20;
           System.out.printf("Maximum: %d.%nAverage: %.2f.%n", n1, avg);
     }
}