import static java.lang.System.*;
import java.util.*;
public class Task07 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter quantity: ");
        int quantity = scanner.nextInt();
        out.print("Please enter number: ");
        int n1 = scanner.nextInt();
        int sum = n1, max = n1, min = n1;
        for (int i= 2; i <= quantity; ++i) {
            out.print("Please enter number: ");
            int n2 = scanner.nextInt();
            sum += n2;
            if (max < n2)
                max = n2;
            if (min > n2)
                min = n2;
        }
        double avg = (1.0 * sum)/ quantity;
        out.printf("Maximum: %d%nMinimun: %d%nAverage: %.2f%n", max, min, avg);
    }
}