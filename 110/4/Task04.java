public class Task04 {
    public static void main (String[] args) {
        int limit = 600, sum = 0;
        for (int num=0 ; num<= limit; ++num ) {
            if ( num%7==0 && num%9==0 ) {
            }
            else if ( num%7==0 || num%9==0 )
                sum += num;
        }
        System.out.printf("Sum: %d%n", sum);
    }
}