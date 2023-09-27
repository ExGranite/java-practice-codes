import static java.lang.System.*;
import java.util.*;
public class Task04 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int sum = 0, num = 2, count = 0;
        System.out.print("Please enter number: ");
        int n1 = scanner.nextInt();
        if (n1%2==0) {
            sum += n1;
            ++count;
        }
        while (num<=20) {
            System.out.print("Please enter number: ");
            int n2 = scanner.nextInt();
            if (n2%2==0) {
                sum += n2;
                ++count;
            }
            if (n2<n1)
                n1 = n2;
            ++num;
        }
        double avg = (1.0 * sum)/count;
        System.out.printf("Minimum: %d%nAverage: %.2f%n", n1, avg);
    }
}