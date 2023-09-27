import static java.lang.System.*;
public class Sphere extends Point {
    protected double area;
    Sphere(double r){
        super(r);
        out.println("Creating a Sphere … done!");
    }
    double space ( ) {
        out.print("The area of the Sphere is ");
        area = 4*Math.PI*Math.pow(getRadius(),2)/3;
        return area;//+"/n";
    }
}