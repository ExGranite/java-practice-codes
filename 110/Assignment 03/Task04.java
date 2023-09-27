import java.util.*;
public class Task04 {
    public static void main(String[] args) {
        Scanner num = new Scanner ( System.in);
        System.out.println("Please enter payment.");
        double pay = num.nextDouble();
        System.out.println("Please enter age.");
        double age = num.nextDouble();
        if (age<18 || pay<10000) {
            System.out.println("No Tax.");
        }
        else if (pay>20000) {
            double tax = pay * 0.10;
            System.out.println("Tax is " + tax + ".");
        }
        else {
            double tax = pay * 0.05;
            System.out.println("Tax is " + tax + ".");
        }
    }
}