import java.util.Scanner;
public class Task09 {
    public static void main (String[] args) {
        Scanner sc; 
        sc = new Scanner ( System.in );
        
        System.out.println("Enter first number:");
        int num;
        num = sc.nextInt();
                
        if ( num %2 == 0 ) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
}