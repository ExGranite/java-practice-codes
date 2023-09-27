import static java.lang.System.*;
import java.util.*;
public class Task13 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int sum = 0;
        System.out.print("Please enter number: ");
        int numN = scanner.nextInt();
        for ( int num = 1; num<=numN; ++num) {
            if (num%2!=0)
                sum += num;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}