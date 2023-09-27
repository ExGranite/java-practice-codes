import static java.lang.System.*;
import java.util.*;
public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number for height: ");
        int a = sc.nextInt();
        out.print("Please enter a number for length: ");
        int b = sc.nextInt();
        for ( int c = 1; c <= a; ++c) {
            for ( int i = 1; i <= b; ++i ) {
                out.printf("*");
            }
            out.println();
        }
    }
}