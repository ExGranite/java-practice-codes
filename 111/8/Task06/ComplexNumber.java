public class ComplexNumber extends RealNumber{
    protected double complex;
    ComplexNumber(int a, int b){
        super(a);
        complex = b;
    }
    ComplexNumber(){
        super(1.0);
        complex = 1;
    }
    public String toString(){
        return super.toString() + "\nImaginaryPart: " + complex;
    }
    public void ping() {
        System.out.println("I'm in ComplexNumber class");
    }
    void check(){
        ping();
        super.ping();
        System.out.println("Checking ended.");
    }
}
