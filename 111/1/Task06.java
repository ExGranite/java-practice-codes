import static java.lang.System.*;
import java.util.*;
public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number: ");
        int a = sc.nextInt();
        for ( int heightCount = 1; heightCount <= a; ++heightCount ) {
            int spaceCount = a - heightCount;
            for ( int i = 1; i <= spaceCount; ++i )
                out.print(" ");
            for ( int i = 1; i <= (heightCount*2-1); ++i ){
                out.printf("%d", i);
            }
            out.println();
        }
        for ( int heightCount = a-1; heightCount >= 1; --heightCount ) {
            int spaceCount = a - heightCount;
            for ( int i = 1; i <= spaceCount; ++i )
                out.print(" ");
            for ( int i = 1; i <= (heightCount*2-1); ++i ){
                out.printf("%d", i);
            }
            out.println();
        }
    }
}