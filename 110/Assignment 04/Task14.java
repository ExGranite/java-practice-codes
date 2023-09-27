import static java.lang.System.*;
import java.util.*;
public class Task14 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int product = 1;
        System.out.print("Please enter quantity: ");
        int quantity = scanner.nextInt();
        for ( int count = 1; count<=quantity; ++count) {
            System.out.print("Pleas enter number: ");
            int num = scanner.nextInt();
            product *= num;
        }
        System.out.printf("Product: %d%n", product);
    }
}