import static java.lang.System.*;
import java.util.*;
public class Task09 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter number: ");
        int num = scanner.nextInt();
        int sum = 0;
        int i = 1;
        for (; i < num; ++i) {
            if (num%i==0)
                sum += i;
        }
        if (sum == i)
            out.printf("%d is a perfect number%n", num);
        else
            out.printf("%d is not a perfect number%n", num);
    }
}