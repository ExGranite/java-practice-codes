import static java.lang.System.*;
import java.util.*;
public class Task08 {
     public static void main (String[] args) {
           int num = 1, limit = 600, sum = 0;
           while (num <= limit ) {
               if ( num%7==0 || num%9==0 )
                   sum += num;
               ++num;
           }
           System.out.printf("Sum: %d%n", sum);
     }
}