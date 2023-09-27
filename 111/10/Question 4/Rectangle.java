public class Rectangle extends Shape {
    private double length, width, area;
    Rectangle(double l, double w){
        super("Rectangle");
        length = l; width = w;
    }
    double area(){
        area = length*width;
        return area;
    }
}