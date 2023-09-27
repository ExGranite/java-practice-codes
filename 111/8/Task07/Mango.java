public class Mango extends Fruit{
    Mango(){
        super(true, "Mango");
    }
    public String toString(){
        if(hasFormalin())
            return "Mangos are bad for you";
        return "Mangos are good for you";
    }
}
