import static java.lang.System.*;
import java.util.*;
public class Task02 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int[] marks = new int[] {10, 30, 20, 50, 40};
        int sum = 0, count = 0;
        for ( int i = 0; i <= 4; ++i)
            sum += marks[i];
        double avg = (1.0 * sum)/5;
        for ( int i = 0; i <= 4; ++i)
            if ( marks[i] > avg )
            ++count;
        System.out.printf("%d student(s) are better than average.%nThey recieved the following marks: ", count);
        for ( int i = 0; i <= 4 ; ++i) {
            if ( marks[i] > avg ) {
                System.out.print(marks[i]);
                if ( i!=4 )
                    System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}