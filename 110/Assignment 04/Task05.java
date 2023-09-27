import static java.lang.System.*;
import java.util.*;
public class Task05 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int value = 0, num = 1;
        System.out.print("Please enter the value of n: ");
        int numN = scanner.nextInt();
        while (num<=numN) {
            value += Math.pow(num, 3);
            ++num;
        }
        double numY = Math.cbrt(value);
        System.out.printf("Y: %.2f%n", numY);
    }
}