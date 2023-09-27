import java.util.Scanner;
public class Task15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter hour.");
        int hour = sc.nextInt();
        if (hour<0 || hour>23) {
            System.out.println("Wrong input.");
        }
        else if (hour<4) {
            System.out.println("Patience is a virtue.");
        }
        else if (hour<7) {
            System.out.println("Breakfast.");
        }
        else if (hour<12) {
            System.out.println("Patience is a virtue.");
        }
        else if (hour<14) {
            System.out.println("Lunch.");
        }
        else if (hour<16) {
            System.out.println("Patience is a virtue.");
        }
        else if (hour<18) {
            System.out.println("Snacks.");
        }
        else if (hour<19) {
            System.out.println("Patience is a virtue.");
        }
        else if (hour<21) {
            System.out.println("Dinner.");
        }
        else {
            System.out.println("Patience is a virtue.");
        }
    }
}