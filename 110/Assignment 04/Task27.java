import static java.lang.System.*;
import java.util.*;
public class Task27 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        int num = 1000;
        for (int i = 1 ; i <=1000; ++i) {
            int count = 0;
            for ( int c = 1; c <= i; ++c)
                if (i%c==0)
                    ++count;
            if (count==2)
                System.out.print(i);
            if ( i!= 997 && count == 2 )
                System.out.print(", ");
        }
        System.out.println();
    }
}