public class Student {
    private String name, id, address;
    private double cgpa;
    public Student () {
    }
    public Student(String n, String i, String a, double c) {
        name = n;
        id = i;
        address = a;
        cgpa = c;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String n) {
        name = n; // OR this.name = n;
    }
    public String getID() {
        return id;
    }
    public void setID(String i) {
        id = i;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String a) {
        address = a;
    }
    public double getCGPA() {
        return cgpa;
    }
    public void setCGPA(double c) {
        cgpa = c;
    }
}