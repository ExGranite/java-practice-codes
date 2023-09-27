import static java.lang.System.*;
import java.util.*;
public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter employee number: ");
        int nEmployee = sc.nextInt();
        out.print("Please enter number of hours worked: ");
        int nHours = sc.nextInt();
        out.print("Please enter amount received per hour: ");
        double nAmount = sc.nextDouble();
        double nSalary = nHours * nAmount;
        out.printf("NUMBER = %d%nSALARY = U$ %.2f%n", nEmployee, nSalary );
        sc.close();
    }
}