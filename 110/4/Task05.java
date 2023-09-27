import static java.lang.System.*;
import java.util.*;
public class Task05 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int[] num = new int[20];
        int i = 0;
        for ( ; i < 20; ++i){
            out.print("Please enter number: ");
            num[i] = scanner.nextInt();
        }
        for (i = 0; i < 20; ++i) {
            if (num[i]%2==0)
                out.printf("%2d is even%n", num[i]);
            else
                out.printf("%2d is odd%n", num[i]);
        }
    }
}