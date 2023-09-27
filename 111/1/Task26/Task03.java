import static java.lang.System.*;
import java.util.*;
public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number A: ");
        int a = sc.nextInt();
        out.print("Please enter a number B: ");
        int b = sc.nextInt();
        int nSOMA = a + b;
        out.printf("SOMA = %d%n", nSOMA );
        sc.close();
    }
}