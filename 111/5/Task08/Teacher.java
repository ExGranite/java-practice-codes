public class Teacher{
    private String name, department, course = "";
    public Teacher(String n, String d){
        name = n;
        department = d;
    }
    public void addCourse(Course c){
        course += c.course + "\n";
    }
    public void printDetail(){
        System.out.printf("========================%nName: %s%nDepartment: %s%nList of courses%n========================%n%s========================%n", name, department, course);
    }
}