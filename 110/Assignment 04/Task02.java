import static java.lang.System.*;
import java.util.*;
public class Task02 {
     public static void main (String[] args) {
           Scanner scanner = new Scanner (in);
           int num = 10 , limit = 50;
           while (num<=limit) {
               if ( num%2!=0 )
                   System.out.println(num);
               ++num;
           }
     }
}