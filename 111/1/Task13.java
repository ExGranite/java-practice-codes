import static java.lang.System.*;
import java.util.*;
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number: ");
        int a = sc.nextInt();
        for ( int i = 1; i<=a; ++i )
            out.print(i);
        for ( int i = a-1; i > 0; --i )
            out.print(i);
        out.println();
    }
}