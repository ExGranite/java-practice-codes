import static java.lang.System.*;
import java.util.*;
public class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter radius of sphere: ");
        double r = sc.nextDouble();
        double volume = (4.0/3)*3.14159*Math.pow(r, 3);
        out.printf("VOLUME = %.3f%n", volume);
        sc.close();
    }
}