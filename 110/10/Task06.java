import static java.lang.System.*;
import java.util.*;
public class Task06 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter a quantity: ");
        int quantity = scanner.nextInt();
        out.printf("Now please enter %d numbers:%n", quantity);
        int[] a = new int[quantity];
        for ( int i = 0; i < a.length; ++i )
            a[i] = scanner.nextInt();
        for ( int c = 0; c < a.length; ++c ) {
            int min = a[c], indexMin = c;
            for ( int i = c + 1; i < a.length; ++i ) {
                if ( a[i] < min ) {
                    min = a[i];
                    indexMin = i;
                }
            }
            int temp = a[c];
            a[c] = min;
            a[indexMin] = temp;
        }
        double median;
        if ( quantity %2 == 0 ) {
            int indexMedian = quantity / 2;
            median = (1.0 * ( a[indexMedian] + a[indexMedian - 1] )) / 2;
        } else {
            int indexMedian = quantity / 2;
            median = a[indexMedian];
        }
        out.printf("Median: %.2f%n", median);
    }
}