import static java.lang.System.*;
import java.util.*;
public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number A: ");
        int a = sc.nextInt();
        out.print("Please enter a number B: ");
        int b = sc.nextInt();
        int nPROD = a * b;
        out.printf("PROD = %d%n", nPROD );
        sc.close();
    }
}