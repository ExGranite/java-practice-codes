import java.util.Scanner;
public class Task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner ( System.in );
        System.out.println("Please enter student's marks.");
        int mark = sc.nextInt();
        if (mark<0 || mark>100) {
            System.out.println("Wrong Input");
        }
        else if (mark<50) {
            System.out.println("F");
        }
        else if(mark<60) {
            System.out.println("E");
        }
        else if(mark<70) {
            System.out.println("D");
        }
        else if(mark<80) {
            System.out.println("C");
        }
        else if(mark<90) {
            System.out.println("B");
        }
        else {
            System.out.println("A");
        }
    }
}