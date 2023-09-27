import static java.lang.System.*;
import java.util.*;
public class MainTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        Student john = new Student();
        Student mike = new Student();
        Student carol = new Student();
        
        out.println("For John:");
//        out.print("Please enter Student's name: ");
        john.setName("John");
        out.print("Please enter Student's ID: ");
        john.setID(scanner.nextLine());
        out.print("Please enter Student's address: ");
        john.setAddress(scanner.nextLine());
        out.print("Please enter Student's cgpa: ");
        john.setCGPA(scanner.nextDouble());
        
        scanner.nextLine();
        
        out.println("For Mike:");
//        out.print("Please enter Student name: ");
        mike.setName("Mike");
        out.print("Please enter Student's ID: ");
        mike.setID(scanner.nextLine());
        out.print("Please enter Student's address: ");
        mike.setAddress(scanner.nextLine());
        out.print("Please enter Student's cgpa: ");
        mike.setCGPA(scanner.nextDouble());
        
        scanner.nextLine();
        
        out.println("For Carol:");
//        out.print("Please enter Student name: ");
        carol.setName("Carol");
        out.print("Please enter Student's ID: ");
        carol.setID(scanner.nextLine());
        out.print("Please enter Student's address: ");
        carol.setAddress(scanner.nextLine());
        out.print("Please enter Student's cgpa: ");
        carol.setCGPA(scanner.nextDouble());
        
        out.printf("For Student 1%nName: %s%nID: %s%nAddress: %s%nCGPA: %.2f%n", john.getName(), john.getID(), john.getAddress(), john.getCGPA());
        out.printf("For Student 2%nName: %s%nID: %s%nAddress: %s%nCGPA: %.2f%n", mike.getName(), mike.getID(), mike.getAddress(), mike.getCGPA());
        out.printf("For Student 3%nName: %s%nID: %s%nAddress: %s%nCGPA: %.2f%n", carol.getName(), carol.getID(), carol.getAddress(), carol.getCGPA());
    }
}