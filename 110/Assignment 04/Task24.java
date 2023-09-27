import static java.lang.System.*;
import java.util.*;
public class Task24 {
     public static void main (String[] args) {
           Scanner scanner = new Scanner (in);
           System.out.print("Please enter number: ");
           int num = scanner.nextInt();
           for ( int i = 1; i <= num; ++i) {
               System.out.print(i);
               if (i!=num)
                   System.out.print(", ");
           }
           System.out.println();
     }
}