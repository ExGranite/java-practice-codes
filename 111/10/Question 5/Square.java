public class Square extends Rectangle {
    public Square(){}
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return length;
    }
    public void setSide(double side){
        length = side;
        width = side;
    }
    public void setWidth(double side){
        width = side;
    }
    public void setLength(double side){
        length = side;
    }
    public String toString(){
        return "It is a square of side "+length;
    }
}