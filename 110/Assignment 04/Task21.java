import static java.lang.System.*;
import java.util.*;
public class Task21 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        System.out.print("Please enter number: ");
        int num = scanner.nextInt( );
        int temp = num, digit = 0;
        for ( ; temp!=0; temp /= 10)
            ++digit;
        
        int power = 1, count = 1;
        for ( ; count < digit; ++count)
            power *= 10;
        
        for ( ; num!=0 ; power /= 10) {
            int result = num/power;
            System.out.printf("%d", result);
            if (power!=1)
                System.out.print(", ");
            num %= power;
        }
        for ( ; power!= 0; power /= 10) {
            System.out.print("0");
            if (power!=1)
                System.out.print(", ");
        }
        System.out.println();
    }
}