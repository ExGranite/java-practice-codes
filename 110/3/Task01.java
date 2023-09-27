import java.util.Scanner;
public class Task01 {
    public static void main (String[] args) {
        Scanner sc; 
        sc = new Scanner ( System.in );
        
        System.out.println("Enter number:");
        int num;
        num = sc.nextInt();
        
        System.out.println("The number you entered is " + num + ".");
    }
}