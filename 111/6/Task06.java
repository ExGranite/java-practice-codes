import static java.lang.System.*;
import java.util.*;
public class Task06{
    public static void main(String[] args){
        Scanner scanner = new Scanner(in);
        out.print("Please enter a quantity: ");
        int quantity = scanner.nextInt();
        int[] a = new int[quantity];
        out.printf("Please enter %d integers:%n", quantity);
        for (int i = 0; i < a.length; ++i){
            a[i] = scanner.nextInt();
        }
        int posCount = 0;
        for (int i = 0; i < a.length; ++i){
            if (a[i] > 0){
                ++posCount;
            }
        }
        int[] b = new int[posCount];
        for (int i = 0; i < b.length;){
            for (int j = 0; j < a.length; ++j){
                if (a[j] > 0){
                    b[i]=a[j];
                    ++i;
                }
            }
        }
        for (int i = 0; i < b.length; ++i){
            out.print(b[i]);
            if (i < b.length-1)
                out.print(", ");
        }
        out.println();
        scanner.close();
    }
}
