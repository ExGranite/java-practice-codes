import static java.lang.System.*;
import java.util.*;
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.println("Please enter the coordinates for p1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        out.println("Please enter the coordinates for p2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        out.printf("%.4f%n", distance);
        sc.close();
    }
}