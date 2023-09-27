import java.util.Scanner;
public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please enter number.");
        int num = sc.nextInt();
        if (num%2==0 || num%5==0) {
        }
        else {
            System.out.println(num);
        }
    }
}