import static java.lang.System.*; 
import java.util.*; 
public class Task18 { 
    public static void main (String[] args) { 
        Scanner scanner = new Scanner (in); 
        System.out.print("Please enter number: ");
        int num = scanner.nextInt();
        int count = 0;
        for ( ; num>=1 ; num /= 10)
            ++count;
        System.out.printf("Your number has %d digits.%n", count);
    } 
} 
