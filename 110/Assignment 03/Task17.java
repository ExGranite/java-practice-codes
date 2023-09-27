import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please enter number.");
        int num = sc.nextInt();
        if (num%2==0 || num%5==0) {
            System.out.println(num);
        }
        else {
        }
    }
}