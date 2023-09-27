public class Jackfruit extends Fruit {
    Jackfruit(){
        super(false, "Jackfruit");
    }
    public String toString(){
        if(hasFormalin())
            return "Jackfruits are bad for you";
        return "Jackfruits are good for you";
    }
}
