import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please enter number.");
        int num = sc.nextInt();
        if (num%2==0) {
            if (num%5==0) {
            }
            else {
                System.out.println(num);
            }
        }
        else if (num%5==0) {
            System.out.println(num);
        }
        else {
        }
    }
}