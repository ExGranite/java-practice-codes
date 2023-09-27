import static java.lang.System.*;
import java.util.*;
public class Task02 {
     public static void main (String[] args) {
          Scanner scanner = new Scanner (in);
          int[] num = new int[10];
          for ( int i= 0; i < num.length; ++i ) {
            out.print("Please enter number: ");
            num[i] = scanner.nextInt();
          }
          out.print("Please enter a number between 0 to 9: ");
          int indexNum = scanner.nextInt();
          out.printf("The number at position %d is %d%n", indexNum, num[indexNum]);
     }
}