import static java.lang.System.*;
import java.util.*;
public class Task10 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        System.out.print("Please enter a quantity: ");
        int quantity = scanner.nextInt();
        int[] num = new int[quantity];
        for ( int i = 0; i < quantity; ++i ) {
            System.out.print("Please enter number: ");
            num[i] = scanner.nextInt();
        }
        for ( int i = 0; i < quantity; ++i ) {
            if ( i == (quantity-1) ) {
                System.out.println("Yes");
                break;
            }
            if ( num[i] < num[(i+1)] )
                continue;
            System.out.println("No");
            break;
        }
    }
}