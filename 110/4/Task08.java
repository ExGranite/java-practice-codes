import static java.lang.System.*;
import java.util.*;
public class Task08 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter number: ");
        int num = scanner.nextInt();
        int count = 0;
        out.print("Divisor(s): ");
        for (int i = 1; i <= num; ++i) {
            if (num%i==0) {
                out.print(i);
                ++count;
                if (i!=num)
                    out.print(", ");
            }
        }
        out.printf("%nNumber or divisor(s): %d%n", count);
    }
}