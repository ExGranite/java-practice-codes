public class Cat{
    public String color = "White";
    public String action = "sitting";
    Cat(){}
    Cat(String c){
        color = c;
    }
    Cat(String c, String a){
        color = a;
        action = c;
    }
    public void printCat(){
        System.out.println(color + " cat is " + action);
    }
    public void changeColor(String c){
        color = c;
    }
}