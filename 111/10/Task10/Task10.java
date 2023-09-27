import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class Task10 {
    public static void main(String[] args) {
        File f;
        Scanner sc;
        try {
            f = new File("C:\\Users\\19101196\\Desktop\\Lab10 27-11-2019\\Task 10\\Input.txt");
            sc = new Scanner(f);
            int a = Integer.parseInt(sc.nextLine());
            int b = Integer.parseInt(sc.nextLine());
            int c = Integer.parseInt(sc.nextLine());
            int sum = a+b+c;
            out.println(sum);
        }
        catch(FileNotFoundException a) {
            err.println("File not found");
        }
    }
}