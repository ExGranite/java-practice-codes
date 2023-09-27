import static java.lang.System.*;
import java.util.*;
public class Task06 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number: ");
        int n = sc.nextInt();
        int y = 0;
        for (int i = 1; i <= n; ++i) {
            if (i%2==0)
                y -= Math.pow(i, 2);
            else
                y += Math.pow(i, 2);
        }
        out.printf("y = %d%n", y);
        sc.close();
    }
}