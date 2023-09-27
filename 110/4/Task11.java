public class Task11 {
    public static void main (String[] args) {
        for (int num = 40; num <= 50; ++num) {
            int count = 0;
            for (int i = 1; i <= num; ++i) {
                if (num%i==0)
                    ++count;
            }
            if (count == 2)
                System.out.printf("%d is a prime number%n", num);
            else
                System.out.printf("%d is not a prime number%n", num);
        }
    }
}