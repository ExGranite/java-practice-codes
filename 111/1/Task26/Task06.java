import static java.lang.System.*;
import java.util.*;
public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter grade A: ");
        double a = sc.nextDouble();
        out.print("Please enter grade B: ");
        double b = sc.nextDouble();
        out.print("Please enter grade C: ");
        double c = sc.nextDouble();
        double average = ((a*2)+(b*3)+(c*5))/(2+3+5);
        out.printf("MEDIA = %.1f%n", average);
        sc.close();
    }
}