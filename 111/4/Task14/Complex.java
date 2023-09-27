public class Complex{
    private double realPart, imaginaryPart;
    public Complex(){}
    public Complex(double realPart, double imaginaryPart){
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
    
        public Complex add(Complex otherNumber){
            realPart += otherNumber.realPart;
            imaginaryPart += otherNumber.imaginaryPart;
            Complex temp = new Complex(realPart, imaginaryPart);
            return temp;
        }
        public Complex subtract(Complex otherNumber){
            realPart -= otherNumber.realPart;
            imaginaryPart -= otherNumber.imaginaryPart;
            Complex temp = new Complex(realPart, imaginaryPart);
            return temp;
        }
        public Complex multiply(Complex otherNumber){
            realPart *= otherNumber.realPart;
            imaginaryPart *= otherNumber.imaginaryPart;
            Complex temp = new Complex(realPart, imaginaryPart);
            return temp;
        }
        public Complex divide(Complex otherNumber){
            realPart /= otherNumber.realPart;
            imaginaryPart /= otherNumber.imaginaryPart;
            Complex temp = new Complex(realPart, imaginaryPart);
            return temp;
        }
        public void setRealPart(double realPart){
            this.realPart = realPart;
        }
        public void setImaginaryPart(double imaginaryPart){
            this.imaginaryPart = imaginaryPart;
        }
        public double getRealPart(){
            return realPart;
        }
        public double getImaginaryPart(){
            return imaginaryPart;
        }
        public String toString(){
            return realPart+"+"+imaginaryPart+"i";
        }
}