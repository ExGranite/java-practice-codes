public class ComplexDemo{
    public static void main(String[] args){
        Complex a = new Complex(2, 3);
        Complex b = new Complex(2, 4);
        Complex c = new Complex();
        c.setRealPart(5);
        c.setImaginaryPart(6);
        c.add(c);
        System.out.println(c.toString());
        b.divide(a);
        System.out.println(b.toString());
    }
}