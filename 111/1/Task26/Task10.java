import static java.lang.System.*;
import java.util.*;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        double pay = 0;
        out.println("For product 1: ");
        for ( int i = 0; i < 2; ++i ) {
            out.print("Please enter product code: ");
            int code = sc.nextInt();
            out.print("Please enter number of units: ");
            int number = sc.nextInt();
            out.print("Please enter price per unit: ");
            double price = sc.nextDouble();
            pay += number * price;
            if (i==0)
                out.println("For product 2: ");
        }
        out.printf("VALOR A PAGAR: R$ %.2f%n", pay);
        sc.close();
    }
}