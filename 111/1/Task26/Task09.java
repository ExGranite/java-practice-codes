import static java.lang.System.*;
import java.util.*;
public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter employee name: ");
        String name = sc.nextLine();
        out.print("Please enter his/her fixed salary: ");
        double salary = sc.nextDouble();
        out.print("Please enter his/her total sale this month: ");
        double sale = sc.nextDouble();
        double total = salary + (0.15 * sale);
        out.printf("Total = R$ %.2f%n", total);
        sc.close();
    }
}