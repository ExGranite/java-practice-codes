import static java.lang.System.*;
import java.util.*;
public class Task15 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int[] num = new int[20];
        int sum = 0;
        for(int i = 0 ; i < num.length; ++i) {
            System.out.print("Please enter number: ");
            num[i] = scanner.nextInt();
        }
        for(int i = 0; i <num.length ; ++i) {
            sum += num[i];
            System.out.printf("Sum of first %2d number(s): %d%n",(i + 1), sum);
        }
    }
}