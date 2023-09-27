import static java.lang.System.*;
import java.util.*;
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter a number: ");
        int a = sc.nextInt();
        for ( int heightCount = 1; heightCount <= a; ++heightCount ) {
            int spaceCount = a - heightCount;
            for ( int i = 1; i <= spaceCount; ++i )
                out.print(" ");
            for ( int i = 1; i<=heightCount; ++i )
                out.print(i);
            for ( int i = heightCount-1; i > 0; --i )
                out.print(i);
            out.println();
        }
    }
}