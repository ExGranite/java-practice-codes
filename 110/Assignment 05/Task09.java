import static java.lang.System.*;
import java.util.*;
public class Task09 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        System.out.print("Please enter quantity: ");
        int quantity = scanner.nextInt();
        String[] name = new String[quantity];
        int[] id = new int[quantity];
        double[] marks = new double[quantity];
        double sum = 0;
        for ( int i = 0; i < quantity; ++i ) {
            System.out.print("Please enter name: ");
            name[i] = scanner.nextLine();
            System.out.print("Please enter ID: ");
            id[i] = scanner.nextInt();
            System.out.print("Please enter marks: ");
            marks[i] = scanner.nextDouble();
            if ( i != (quantity-1) )
                System.out.println("For Next Student: ");
        }
        for ( int i = 0; i < quantity; ++i )
            sum += marks[i];
        double avg = sum/quantity;
        System.out.printf("Average Marks: %.2f%n", avg);
        for ( int i = 0; i < quantity; ++i )
            System.out.printf("%s (ID: %d): %.2f%n", name[i], id[i], marks[i]);
    }
}