import static java.lang.System.*;
import java.util.*;
public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String a = new String();
        out.print("Please enter a String in Upper-case letters only: ");
        a = scanner.nextLine();
        int[] b = new int[26];
        for (int i = 65; i <= 90; ++i){
            for (int j = 0; j < a.length(); ++j){
                if(a.charAt(j) == (char) i){
                    b[i-65] += 1;
                }
            }
        }
        int max = 0;
        int location = 0;
        for (int i = 0; i < b.length; ++i){
            for (int j = i+1; j < b.length; ++j){
                if(b[i]<b[j]){
                    int temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                    location = j;
                }
            }
            max++;
            if (max == 2){
                out.println((char) (location+65));
                break;
            }
        }
        scanner.close();
    }
}