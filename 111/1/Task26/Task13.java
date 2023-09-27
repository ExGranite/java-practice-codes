import static java.lang.System.*;
import java.util.*;
public class Task13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.println("Please enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = a;
        if (b>a)
            if (b>c)
                max = b;
            else
                max = c;
        else if (c>a)
            max = c;
        out.printf("%d eh o maior%n", max);
        sc.close();
    }
}