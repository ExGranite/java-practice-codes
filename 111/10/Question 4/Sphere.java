public class Sphere extends Shape {
    private double radius, surfaceArea;
    Sphere(double r){
        super("Sphere");
        radius = r;
    }
    double area(){
        surfaceArea = 4*Math.PI*Math.pow(radius,2);
        return surfaceArea;
    }
}