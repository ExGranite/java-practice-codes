public class TestResizableCircle {
    public static void main(String[] args) {
        ResizableCircle a = new ResizableCircle(12);
        System.out.println(a.radius);
        a.resize(10);
        System.out.println(a.radius);
    }
}