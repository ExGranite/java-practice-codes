import static java.lang.System.*;
import java.util.*;
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter grade A: ");
        double a = sc.nextDouble();
        out.print("Please enter grade B: ");
        double b = sc.nextDouble();
        double average = ((a*3.5)+(b*7.5))/(3.5+ 7.5);
        out.printf("MEDIA = %.5f%n", average);
        sc.close();
    }
}