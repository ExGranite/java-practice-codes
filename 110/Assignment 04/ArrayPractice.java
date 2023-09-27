import static java.lang.System.*;
import java.util.Scanner;
public class ArrayPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        int[] num = new int[20];
        int sum = 0;
        for(int i = 0 ; i < num.length; i++) {
            out.println("Please enter a number");
            num[i] = sc.nextInt();
        }
        for(int i = 0; i <num.length ; i++) {
            sum += num[i];
            out.printf("Summation of %d number is: %d%n",(i + 1), sum);
        }
    }
}