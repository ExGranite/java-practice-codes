import java.util.Scanner;
public class Task05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please enter time.");
        int sec = sc.nextInt();
        int hours, minutes ;
        hours =  sec/3600;
        minutes = (sec%3600)/60;
        sec = (sec%3600)%60;
        System.out.println("Hours: " + hours);
        System.out.println();
        System.out.println("Minutes: " + minutes);
        System.out.println();
        System.out.println("Seconds: " + sec);
    }
}
        