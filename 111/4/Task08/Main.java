import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        Student john = new Student();
        Student mike = new Student();
        Student carol = new Student();
        //John
        john.setName("John");
        john.setID("12345");
        john.setAddress("A/BC");
        john.setCGPA(3.88);
        //Mike
        mike.setName("Mike");
        mike.setID("12346");
        mike.setAddress("C/DE");
        mike.setCGPA(2.0);
        //Carol
        carol.setName("Carol");
        carol.setID("12347");
        carol.setAddress("E/FG");
        carol.setCGPA(3.98);
        out.printf("For Student 1%nName: %s%nID: %s%nAddress: %s%nCGPA: %.2f%n%n", john.getName(), john.getID(), john.getAddress(), john.getCGPA());
        out.printf("For Student 2%nName: %s%nID: %s%nAddress: %s%nCGPA: %.2f%n%n", mike.getName(), mike.getID(), mike.getAddress(), mike.getCGPA());
        out.printf("For Student 3%nName: %s%nID: %s%nAddress: %s%nCGPA: %.2f%n", carol.getName(), carol.getID(), carol.getAddress(), carol.getCGPA());
        
        //using constructor
        john = new Student("John", "21345", "p/BC", 3.08);
        mike = new Student("Mike", "21346", "o/DE", 2.03);
        carol = new Student("Carol", "21347", "i/FG", 3.90);
        out.printf("For Student 1%nName: %s%nID: %s%nAddress: %s%nCGPA: %.2f%n%n", john.getName(), john.getID(), john.getAddress(), john.getCGPA());
        out.printf("For Student 2%nName: %s%nID: %s%nAddress: %s%nCGPA: %.2f%n%n", mike.getName(), mike.getID(), mike.getAddress(), mike.getCGPA());
        out.printf("For Student 3%nName: %s%nID: %s%nAddress: %s%nCGPA: %.2f%n", carol.getName(), carol.getID(), carol.getAddress(), carol.getCGPA());
    }
}