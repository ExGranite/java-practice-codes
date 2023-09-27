import static java.lang.System.*;
import java.util.*;
public class Task09 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (in);
        int[] a = new int[10];
        out.println("Please enter 10 numbers:");
        for (int i = 0; i < a.length; ++i)
            a[i] = sc.nextInt();
        out.printf("Please chose one of the following:%n A. Sort the numbers at odd positions only.%n B. Sort the numbers at even positions only.%n C. Sort the numbers at all positions.%n");
        sc.nextLine();
        String choice = sc.nextLine();
        for (int i = 0; i < 1; ) {
            if (choice.equals ("A") || choice.equals ("B") || choice.equals ("C")) {
                break;
            }
            else {
                out.println("Please make a valid choice:");
                choice = sc.nextLine();
            }
        }
        if (choice.equals ("A")) {
            for (int i = 0; i < a.length-1; i += 2) {
                for (int j = i+2; j < a.length; j += 2) {
                    if (a[j] < a[i]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        } else if (choice.equals ("B")) {
            for (int i = 1; i < a.length; i += 2) {
                for (int j = i+2; j < a.length; j += 2) {
                    if (a[j] < a[i]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < a.length-1; ++i) {
                for (int j = i+1; j < a.length; ++j) {
                    if (a[j] < a[i]) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
        }
        int j = 0;
        for ( ; j < a.length-1; ++j) {
            out.printf("%d, ", a[j]);
        }
        out.println(a[j]);;
        sc.close();
    }
}