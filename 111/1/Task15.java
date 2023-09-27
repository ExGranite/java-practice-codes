import static java.lang.System.*;
import java.util.*;
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number: ");
        int a = sc.nextInt();
        for ( int i = 1; i <= a; ++i ) {
            out.printf("*");
        }
        out.println();
    }
}