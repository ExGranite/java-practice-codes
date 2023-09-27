import static java.lang.System.*;
import java.util.*;
public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number: ");
        int a = sc.nextInt();
        for ( int heightCount = 1; heightCount <= a; ++heightCount ) {
            for ( int i = 1; i <= heightCount; ++i ){
                if ( i == 1 || i == heightCount || heightCount == a )
                    out.printf("%d", i);
                else
                    out.print(" ");
            }
            out.println();
        }
    }
}