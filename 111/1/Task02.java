import static java.lang.System.*;
import java.util.*;
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number for height: ");
        int a = sc.nextInt();
        out.print("Please enter a number for length: ");
        int b = sc.nextInt();
        for ( int c = 1; c <= a; ++c) {
            int i = 1;
            for ( ; i < b; ++i ) {
                out.printf("%d  ", i);
            }
            out.println(i);
        }
    }
}