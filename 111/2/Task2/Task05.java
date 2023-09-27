import static java.lang.System.*;
import java.util.*;
public class Task05 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter Voltage (volts): ");
        double nE = sc.nextDouble();
        out.print("Please enter Resistance (ohms): ");
        double nR = sc.nextDouble();
        out.print("Please enter Inductance (henrys): ");
        double nL = sc.nextDouble();
        out.print("Please enter Capacitance (farads): ");
        double nC = sc.nextDouble();
        out.print("Please enter Frequency (hertz): ");
        double nf = sc.nextDouble();
        double nI = nE/(Math.sqrt(Math.pow(nR, 2) + Math.pow((2.0*Math.PI*nf*nL)-(1/(2.0*Math.PI*nf*nC)), 2)));
        out.printf("I = %.4famperes%n", nI);
        sc.close();
    }
}