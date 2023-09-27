public abstract class Shape {
    private String shapeName;
    Shape(String n){
        shapeName = n;
    }
    abstract double area();
    public String toString(){
        return "The shape is a" + shapeName;
    }
}