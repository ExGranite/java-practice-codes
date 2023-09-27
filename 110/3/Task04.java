import java.util.Scanner;
public class Task04 {
    public static void main (String[] args) {
        Scanner sc; 
        sc = new Scanner ( System.in );
        
        System.out.println("Enter radius of circle:");
        double radius = sc.nextFloat();
        
        double circumference = 2 * 3.1416 * radius;
        double area = 3.1416 * Math.pow(radius, 2);
        
        System.out.println("Circumference:" + circumference);
        System.out.println("Area:" + area);
    }
}