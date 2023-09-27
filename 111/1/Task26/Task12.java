import static java.lang.System.*;
import java.util.*;
public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number A: ");
        double a = sc.nextDouble();
        out.print("Please enter a number B: ");
        double b = sc.nextDouble();
        out.print("Please enter a number C: ");
        double c = sc.nextDouble();
        out.printf("TRIANGULO: %.3f%nCIRCULO: %.3f%nTRAPEZIO: %.3f%nQUADRADO: %.3f%nRETANGULO: %.3f%n", 
                   0.2*a*c, 3.14159*Math.pow(c, 2), 0.5*(a+b)*c, b*b, a*b);
        sc.close();
    }
}