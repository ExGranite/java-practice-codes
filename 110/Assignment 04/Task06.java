import static java.lang.System.*;
import java.util.*;
public class Task06 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int numY = 0, num = 1, sign = 1;
        System.out.print("Please enter the value of n: ");
        int numN = scanner.nextInt();
        while (num<=numN) {
            numY += (num * num * sign);
            ++num;
            sign = -sign;
        }
        System.out.printf("Y: %d%n", numY);
    }
}