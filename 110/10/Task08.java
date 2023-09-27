import static java.lang.System.*;
import java.util.*;
public class Task08 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        String[] a = new String[] {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        boolean fact = true;
        out.print("Please enter a number between 0 and 9: ");
        int index = scanner.nextInt();
        for ( ; fact == true; ) {
            if ( index >= 0 && index <= 9 )
                fact = false;
            else {
                out.print("An error has occured. Please make sure to enter a number between 0 and 9: ");
                index = scanner.nextInt();
            }    
        }
        out.println(a[index]);
    }
}