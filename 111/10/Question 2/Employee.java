public class Employee extends Person {
    private double salary;
    private int year;
    private String insurance;
    double getSalary(){
        return salary;
    }
    int getYear(){
        return year;
    }
    String getInsurance(){
        return insurance;
    }
    void setSalary(double s){
        salary = s;
    }
    void setYear(int y){
        year = y;
    }
    void setInsurance(String i){
        insurance = i;
    }
    Employee(String n){
        super(n);
    }
    Employee(String n, String i){
        super(n);
        insurance = i;
    }
    Employee(String n, double s, int y, String i){
        super(n);
        salary = s;
        year = y;
        insurance = i;
    }
    void equals(Employee a){
        if(a.getName().equals(getName()) && a.insurance.equals(insurance))
            System.out.println("They are the same Employee");
        else if(a.salary==salary && a.year==year)
            System.out.println("They are not the same Employee but started working on the same year and receive the similar salaries");
        else if(a.year==year)
            System.out.println("They are not the same Employee but started working on the same year");
        else if(a.salary==salary)
            System.out.println("They are not the same Employee but receive similar salaries");
        else
            System.out.println("They are two different employees");
    }
}