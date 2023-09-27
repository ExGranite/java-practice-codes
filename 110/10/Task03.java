import static java.lang.System.*;
import java.util.*;
public class Task03 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int[] a = new int[5];
        out.println("Please enter 5 numbers:");
        for ( int i = 0; i < a.length; ++i )
            a[i] = scanner.nextInt();
        int max = a[0], indexMax = 0, min = a[0], indexMin = 0;
        for ( int i = 1; i < a.length; ++i ) {
            if ( a[i] > max ) {
                max = a[i];
                indexMax = i;
            }
            if ( a[i] < min ) {
                min = a[i];
                indexMin = i;
            }
        }
        out.printf("Largest number %d was found at location %d.%n", max, indexMax);
        out.printf("Smallest number %d was found at location %d.%n", min, indexMin);
    }
}