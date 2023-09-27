public class ResizableCircle extends Circle implements Resizable {
    public ResizableCircle(double radius) {
        super(radius);
    }
    public void resize(int percent){
        radius = radius * Math.sqrt((percent*1.0)/100);
    }
}