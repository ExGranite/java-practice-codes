import static java.lang.System.*;
import java.util.*;
public class Task21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (in);
        out.print("Please enter length: ");
        int length = sc.nextInt();
        out.print("Please enter width: ");
        int width = sc.nextInt();
        for ( int lengthCount = 1; lengthCount <= length; ++lengthCount ) {
            if ( lengthCount ==1 || lengthCount == length ) {
                for ( int widthCount = 1; widthCount  <= width; ++widthCount )
                    out.print("*");
                out.println();
            }
            else
                for ( int widthCount = 1; widthCount  <= width; ++widthCount ) {
                if ( widthCount == 1 || widthCount == width )
                    out.print("*");
                else
                    out.print(" ");
                if ( widthCount == width )
                    out.println();
            }
        }
    }
}