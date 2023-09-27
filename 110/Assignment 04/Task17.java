import static java.lang.System.*; 
import java.util.*; 
public class Task17 { 
    public static void main (String[] args) { 
        Scanner scanner = new Scanner (in); 
        int n1 = 0, n2 = 1;
        System.out.printf("%d, %d", n1, n2);
        for (int n3 = n1 + n2; n3<1600; n3 = n1 + n2) {
            System.out.printf(", %d", n3);
            n1=n2;
            n2=n3;
        }
        System.out.println();
    }
}