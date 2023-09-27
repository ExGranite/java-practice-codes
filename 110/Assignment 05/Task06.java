import static java.lang.System.*;
import java.util.*;
public class Task06 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int[] a = new int[] {10, 30, 20, 50, 40};
        System.out.print("Please enter a number n: ");
        int n = scanner.nextInt();
        for ( int count = 0 ; count < n; ++count ) {
            int max = a[count], temp = a[count];
            for ( int i = count; i <= 4; ++i )
                if ( a[i] > max )
                max = a[i];
            for ( int i = count; i <= 4; ++i )
                if ( max == a[i] )
                a[i] = temp;
            a[count] = max;
        }
        System.out.printf("The nth largest number is %d%n", a[(n-1)]);
    }
}