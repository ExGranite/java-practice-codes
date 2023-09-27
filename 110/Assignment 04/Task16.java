import static java.lang.System.*; 
import java.util.*; 
public class Task16 { 
    public static void main (String[] args) { 
        Scanner scanner= new Scanner (in); 
        System.out.print("Please enter number: ");
        int n1 = scanner.nextInt();
        int max = n1, min = n1, sum = n1;
        for (int i=2; i<=10; ++i) {
            System.out.print("Please enter number: ");
            int n2 = scanner.nextInt();
            if (n2>max)
                max = n2;
            if (n2<min)
                min = n2;
            sum += n2;
        }
        double avg = (1.0 * sum)/10;
        System.out.printf("Maximum: %d%nMinimum: %d%nAverage: %.2f%n", max, min, avg);
    }
}