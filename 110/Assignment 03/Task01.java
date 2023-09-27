import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please enter student's marks.");
        int marks = sc.nextInt();
        if (marks>50) {
            System.out.println("Pass");
        }
        else {
            System.out.println("You shall not pass.");
        }
    }
}