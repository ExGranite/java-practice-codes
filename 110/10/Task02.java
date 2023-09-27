import static java.lang.System.*;
import java.util.*;
public class Task02 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int[] a = new int[5];
        out.println("Please enter 5 numbers:");
        for ( int i = 0; i < a.length; ++i )
            a[i] = scanner.nextInt();
        int max = a[0], index = 0;
        for ( int i = 1; i < a.length; ++i )
            if ( a[i] > max ) {
                max = a[i];
                index = i;
        }
        out.printf("Largest number %d was found at location %d.%n", max, index);
    }
}