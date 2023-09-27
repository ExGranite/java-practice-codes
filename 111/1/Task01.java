import static java.lang.System.*;
import java.util.*;
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number: ");
        int a = sc.nextInt();
        int i = 1;
        for ( ; i < a; ++i ) {
            out.printf("%d ", i);
        }
        out.println(a);
    }
}