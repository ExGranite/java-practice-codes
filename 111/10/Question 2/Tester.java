public class Tester {
    public static void main(String[] args) { 
        Employee a = new Employee("Jack");
        System.out.println(a.getName());
        a = new Employee("Jack","Ins");
        System.out.println(a.getName());
        System.out.println(a.getInsurance());
        Employee c = new Employee("Jack", 3.5, 2001, "Is");
        System.out.println(c.getName());
        System.out.println(c.getInsurance());
        System.out.println(c.getSalary());
        System.out.println(c.getYear());
        c.equals(a);
    }
}
