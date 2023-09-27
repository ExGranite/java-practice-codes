import static java.lang.System.*;
import java.util.*;
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter total distance(in Km): ");
        int distance = sc.nextInt();
        out.print("Please enter the total fuel spent(in liters): ");
        double fuel = sc.nextDouble();
        out.printf("%.3f km/l%n", distance/fuel);
        sc.close();
    }
}