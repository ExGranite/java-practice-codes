import static java.lang.System.*;
import java.util.*;
public class Task08 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        System.out.print("Please enter a quantity: ");
        int quantity = scanner.nextInt();
        int[] num = new int[quantity];
        double median;
        for ( int i = 0; i < quantity; ++i) {
            System.out.print("Please enter a number: ");
            num[i] = scanner.nextInt();
        }
        for ( int count = 0 ; count < quantity; ++count ) {
            int min = num[count], temp = num[count];
            for ( int i = count; i < quantity; ++i )
                if ( num[i] < min )
                min = num[i];
            for ( int i = count; i < quantity; ++i )
                if ( min == num[i] )
                num[i] = temp;
            num[count] = min;
        }
        if ( quantity%2!=0 )
            median = num[(quantity/2)];
        else
            median = (1.0 * ( num[(quantity/2)] + num[((quantity/2) - 1 )] ))/2;
        System.out.printf("Median: %.2f%n", median);
    }
}