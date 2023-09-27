import static java.lang.System.*;
import java.util.*;
public class Task30 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        System.out.print("Please enter the starting number of the range: ");
        int n1 = scanner.nextInt();
        System.out.print("Please enter the ending number of the range: ");
        int n2 = scanner.nextInt();
        int perfect = 0, prime = 0, temp = n1;
        for ( ; temp <= n2; ++temp) {
            int count = 0, sum = 0;
            for ( int i = 1; i <= temp; ++i) {
                if ( temp%i==0 ) {
                    ++count;
                    sum += i;
                }
            }
            //sum -= temp;
            if ( temp==(sum-temp) )
                ++perfect;
            else if ( count==2 )
                ++prime;
        }
        System.out.printf("Between %d and %d, found %d prime number(s) and %d perfect number(s)%n", n1, n2, prime, perfect);
    }
}