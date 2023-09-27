public class Paint {
    private double coverage, amount;
    Paint(double c){
        coverage = c;
    }
    double amount(double area){
        amount = area/coverage;
        return amount;
    }
}