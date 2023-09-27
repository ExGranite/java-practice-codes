import java.util.Scanner;
public class Task02 {
    public static void main (String[] args) {
        Scanner sc; 
        sc = new Scanner ( System.in );
        
        System.out.println("Enter first number:");
        int num1;
        num1 = sc.nextInt();
        
        System.out.println("Enter second number:");
        int num2;
        num2 = sc.nextInt();
        
        int sum, difference, product;
        
        sum = num1 + num2;
        product = num1 * num2;
        
        if ( num1 > num2 ) {
            difference = num1 - num2;
        } else {
            difference = num2 - num1;
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
    }
}