abstract class Person {
    private String name;
    String getName(){
        return name;
    }
    void setName(String n){
        name = n;
    }
    Person(String n){
        name = n;
    }
    Person(){}
}