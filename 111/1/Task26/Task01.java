import static java.lang.System.*;
import java.util.*;
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number A: ");
        int a = sc.nextInt();
        out.print("Please enter a number B: ");
        int b = sc.nextInt();
        out.printf("X = %d%n", a+b );
        sc.close();
    }
}