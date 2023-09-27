import static java.lang.System.*;
import java.util.*;
public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("Enter radius of Circle: ");
        double Cr = scanner.nextDouble();
        Circle c1 = new Circle(Cr);
        out.println(c1.space());
        out.print("Enter radius of Sphere: ");
        double Sr = scanner.nextDouble();
        Sphere s1 = new Sphere(Sr);
        out.println(s1.space());
        scanner.close();
    }
}
