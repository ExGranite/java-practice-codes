import static java.lang.System.*;
import java.util.*;
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a radius, R: ");
        double nR = sc.nextDouble();
        double nA = 3.14159 * Math.pow(nR,2);
        out.printf("A=%.4f%n", nA);
        sc.close();
    }
}