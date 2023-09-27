public class PaintThings {
    public static void main(String[] args) { 
        Paint p = new Paint(500);
        Rectangle r = new Rectangle(20, 35);
        Sphere s = new Sphere(15);
        Cylinder c = new Cylinder(10,30);
        System.out.println(p.amount(r.area()));
        System.out.println(p.amount(s.area()));
        System.out.println(p.amount(c.area()));
    }
}
