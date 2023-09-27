public class Cat{ 
    public String color = "White"; 
    public String action = "sitting"; 
    Cat(){}
    Cat(String c){
        color = c;
    }
    Cat(String c, String a){
        color = c;
        action = a;
    }
    void printCat(){
        System.out.printf("%s cat id %s%n", color, action);
    }
    void changeColor(String c){
        color = c;
    }
}