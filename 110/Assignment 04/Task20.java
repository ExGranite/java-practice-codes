import static java.lang.System.*; 
import java.util.*; 
public class Task20 { 
     public static void main (String[] args) { 
           Scanner scanner = new Scanner (in); 
           System.out.print("Please enter number: ");
           int num = scanner.nextInt();
           System.out.printf("%d", num%10);
           for (num /= 10 ; num>=1; num /= 10) {
               int remainder = num%10;
               System.out.printf(", %d", remainder);
           }
           System.out.println();
     }
} 
