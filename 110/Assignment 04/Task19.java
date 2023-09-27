import static java.lang.System.*; 
import java.util.*; 
public class Task19 { 
    public static void main (String[] args) { 
        Scanner scanner = new Scanner (in); 
        System.out.print("Please enter number: ");
        int limit = scanner.nextInt();
        int product = 1;
        for (int num = 1 ; num<=limit ; ++num)
            product *= 10;
        System.out.printf("10 to the power %d is %d%n", limit, product);      
//        double ok = Math.pow(10, limit);
//        System.out.printf("10 to the power %d is %.0f%n", limit, ok);      
    } 
} 
