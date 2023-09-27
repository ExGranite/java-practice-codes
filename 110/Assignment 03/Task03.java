import java.util.*;
public class Task03 {
    public static void main(String[] args) {
        Scanner num = new Scanner ( System.in);
        System.out.println("Please enter height of rectangle.");
        double height = num.nextDouble();
        System.out.println("Please enter width of rectangle.");
        double width = num.nextDouble();
        double area = height * width;
        System.out.println(area);
    }
}