import static java.lang.System.*;
import java.util.*;
public class Task06 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter quantity: ");
        int quantity = scanner.nextInt();
        int[] num = new int[quantity];
        int i = 0;
        for ( ; i < quantity; ++i){
            out.print("Please enter number: ");
            num[i] = scanner.nextInt();
        }
        for (i = 0; i < quantity; ++i) {
            if (num[i]%2==0)
                out.printf("%2d is even%n", num[i]);
            else
                out.printf("%2d is odd%n", num[i]);
        }
    }
}