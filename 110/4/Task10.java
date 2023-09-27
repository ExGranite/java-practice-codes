import static java.lang.System.*;
import java.util.*;
public class Task10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter number: ");
        int num = scanner.nextInt();
        int count = 0;
        for (int i = 1; i <= num; ++i) {
            if (num%i==0)
                ++count;
        }
        if (count == 2)
            out.printf("%d is a prime number%n", num);
        else
            out.printf("%d is not a prime number%n", num);
    }
}