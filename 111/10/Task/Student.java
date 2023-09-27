import static java.lang.System.*;
public class Student {
    String name = "", id = "", department = "";
    double cgpa = 0.0;
    
    Student(String n, String i, String c, String d) {
        name = n;
        id = i;
        cgpa = Double.parseDouble(c);
        department = d;
    }
    void print(){
        out.printf("Name: %s%nID: %s%nCGPA: %.2f%nDepartment: %s%n%n", name, id, cgpa, department);
    }
}