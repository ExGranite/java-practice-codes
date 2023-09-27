import static java.lang.System.*;
import java.util.*;
public class Task01b {
    public static void main (String[] args) {
        Scanner sc = new Scanner(in);
        double z;
        z = 5+ Math.sin(80*Math.PI/180);
//        System.out.println(z);
        System.out.printf("%.4f%n", z);
        sc.close();
    }
}