import static java.lang.System.*;
public class Circle extends Point {
    double area;
    Circle(double r){
        super(r);
        out.println("Creating a Circle … done!");
    }
    double space ( ) {
        out.print("The area of the Circle is ");
        area = Math.PI*Math.pow(getRadius(),2);
        return area;//+"/n";
    }
}
