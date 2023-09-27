import static java.lang.System.*;
import java.util.*;
public class Task23 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        out.print("Please enter number: ");
        int num = scanner.nextInt( );
        int temp = num, digit = 0;
        for ( ; temp!=0; temp /= 10)
            ++digit;
        int power = 1, count = 1;
        for ( ; count < digit; ++count)
            power *= 10;
        for ( ; num!=0 ; power /= 10) {
            int result = num/power;
            if (result==0)
                out.print("Zero");
            else if (result==1)
                out.print("One");
            else if (result==2)
                out.print("Two");
            else if (result==3)
                out.print("Three");
            else if (result==4)
                out.print("Four");
            else if (result==5)
                out.print("Five");
            else if (result==6)
                out.print("Six");
            else if (result==7)
                out.print("Seven");
            else if (result==8)
                out.print("Eight");
            else
                out.print("Nine");
            if (power!=1)
                out.print(", ");
            num %= power;
        }
        for ( ; power!= 0; power /= 10) {
            out.print("Zero");
            if (power!=1)
                out.print(", ");
        }
        out.println();
    }
}