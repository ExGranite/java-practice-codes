import static java.lang.System.*;
import java.util.*;
public class Task29 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        System.out.print("Please enter number: ");
        int num = scanner.nextInt();
        int sum = 0;
        for ( int i = 1; i < num; ++i)
            if (num%i==0)
                sum += i;
        if (sum == num)
            System.out.println("The number is a perfect number.");
        else
            System.out.println("The number is not a perfect number.");
    }
}