import static java.lang.System.*;
import java.util.*;
public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number: ");
        int a = sc.nextInt();
        for ( int heightCount = 1; heightCount <= a; ++heightCount ) {
            int spaceCount = a - heightCount;
            for ( int i = 1; i <= spaceCount; ++i ) {
                out.print(" ");
            }
            for ( int n = spaceCount+1; n <= a; ++n ) {
                if ( n == spaceCount+1 || n == a  || heightCount == a )
                    out.print(n);
                else
                    out.print(" ");
            }
            out.println();
        }
    }
}