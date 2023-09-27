import static java.lang.System.*;
import java.util.*;
public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number A: ");
        int a = sc.nextInt();
        out.print("Please enter a number B: ");
        int b = sc.nextInt();
        out.print("Please enter a number C: ");
        int c = sc.nextInt();
        out.print("Please enter a number D: ");
        int d = sc.nextInt();
        out.printf("DIFERENCA = %d%n", (a*b)-(c*d) );
        sc.close();
    }
}