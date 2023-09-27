public class circle {
    private double radius = 1.0;
    private String color = "red";
    public circle(){
    }
    public circle(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        double area = Math.PI * radius * radius;
        return area;
    }
}