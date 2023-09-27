import static java.lang.System.*;
import java.util.*;
public class Task22 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner (in);
        System.out.print("Please enter a number between 0 and 9: ");
        int num = scanner.nextInt();
        if (num==0)
            System.out.println("Zero");
        else if (num==1)
            System.out.println("One");
        else if (num==2)
            System.out.println("Two");
        else if (num==3)
            System.out.println("Three");
        else if (num==4)
            System.out.println("Four");
        else if (num==5)
            System.out.println("Five");
        else if (num==6)
            System.out.println("Six");
        else if (num==7)
            System.out.println("Seven");
        else if (num==8)
            System.out.println("Eight");
        else
            System.out.println("Nine");        
    }
}