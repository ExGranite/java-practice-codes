public class Student {
    String name, address, id;
    double cgpa;
    Student(){}
    Student(String n, String i, String a, double c){
        name = n;
        address = a;
        id = i;
        cgpa = c;
    }
    String nameDao(){
        if (name == null)
            return "Ei name e kono student nai";
        else
            return name;
    }
    String boloToAmiKe(){
        if (id == null)
            return "Student ei nai, abar id :P";
        else
            return id;
    }
    String addressDao(){
        if (address == null)
            return "Naam nai .. thikana ashbe koi theke?";
        else
            return address;
    }
    double cgpaDao(){
        if (cgpa == 0.0)
            return -4.0;
        else
            return cgpa;
    }
    void nameBoshao(String n){
        name = n;
    }
    void addressBoshao(String a){
        address = a;
    }
    void idBoshao(String i){
        id = i;
    }
    void cgpaBoshao(double c){
        cgpa = c;
    }
    void standUp(){
        System.out.printf("%s is now standing up!!", name);
    }
    String tellMeYourName(){
        return "Sir, my name is " + name;
    }
    void call(String n){
        System.out.printf("%s: Hey, %s Sir is calling you!!%n", name, n);
    }
    int add2Numbers(int x, int y){
        return x + y;
    }
}