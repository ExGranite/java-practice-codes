public class Student implements StInterface {
    public String name, id, address;
    Student(String n, String i, String a){
        name = n; id = i; address = a;
    }
    public void setName(String n){
        name = n;
    }
    public void setID(String i){
        id = i;
    }
    public String getName(){
        return name;
    }
    public String getID(){
        return id;
    }
    public void setAddress(String a){
        address = a;
    }
    public String getAddress(){
        return address;
    }
}