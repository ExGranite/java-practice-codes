public class Cylinder extends Shape {
    private double radius, height, surfaceArea;
    Cylinder(double r, double h){
        super("Cylinder");
        radius = r; height = h;
    }
    double area(){
        surfaceArea = 2*Math.PI*Math.pow(radius, 2) + 2*Math.PI*radius*height;
        return surfaceArea;
    }
}