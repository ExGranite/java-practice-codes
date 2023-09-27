import static java.lang.System.*;
import java.util.*;
public class HappyNumberTask06 {
    public static void main(String[] args) {
        out.print("Please enter how many numbers you want to check: ");
        int n = new Scanner(in).nextInt();
        int[] c = new int[n];
        out.printf("Please enter %d number(s) to check: %n", n);
        for(int i = 0; i < c.length; i++){
            c[i] = new Scanner(in).nextInt();
        }
        for(int i = 0; i < c.length; i++){
            int temp = c[i];
            for( int b = 1; b!=0; ++b){
                if(temp==1){
                    out.printf("Case #%d: %d is a Happy number.%n", i+1, c[i]);
                    break;
                }else{
                    int stemp = 0;
                    while (temp> 0){
                        stemp += Math.pow(temp % 10, 2);
                        temp /= 10;
                    }
                    temp = stemp;
                    if(b==999){
                        out.printf("Case #%d: %d is an Unhappy number.%n", i+1, c[i]);
                        break;
                    }
                }
            }
        }
    }
}