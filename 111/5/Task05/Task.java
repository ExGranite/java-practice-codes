public class Task {
    public static void main(String[] args) {
        int x[] = {35};
        A a1 = new A();
        A a2 = new A(-5,-7);
        B b1 = new B();
        B b2 = new B(b1);
        a1.methodA(1, x);
        b2.methodB(3, 2);
        a2.methodA(1, x);
    }
}
