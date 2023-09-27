//import java.util.HashSet;
//import java.util.Scanner;
//import java.util.Set;
import java.util.*;

public class HappyNumber{

    public static boolean isHN(int num)
    {
        Set<Integer> a = new HashSet<Integer>();

        while (a.add(num))
        {
            int value = 0;
            while (num > 0)
            {
                value += Math.pow(num % 10, 2);
                num /= 10;
            }
            num = value;
        }

        return (num == 1);
    }

    public static void main(String[] args)
    {
        System.out.print("Input a number: ");
        int num = new Scanner(System.in).nextInt();
        System.out.println(isHN(num) ? "Happy Number" : "Unhappy Number");
    }
}