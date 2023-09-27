public class Task01 {
    public static void main (String[] args) {
        
        System.out.print("(a) ");
        int sum1 = 24;
        for ( int i = 1; i <= 6; ++i) {
            System.out.print(sum1 + " ");
            sum1 -= 6;
        }
        System.out.println();
        
        System.out.print("(b) ");
        int sum2 = -10;
        for ( int i = 1; i <= 7; ++i) {
            System.out.print(sum2 + " ");
            sum2 += 5;
        }
        System.out.println();
        
        System.out.print("(c) ");
        int sum3 = 18;
        for ( int i = 1; i <= 6; ++i) {
            System.out.print(sum3 + " ");
            sum3 += 9;
        }
        System.out.println();
        
        System.out.print("(d) ");
        int sum4 = 18;
        int sign = 1;
        for ( int i = 1; i <= 6; ++i) {
            System.out.print(sum4 * sign + " ");
            sum4 += 9;
            sign = -sign;
        }
        System.out.println();
    }
}