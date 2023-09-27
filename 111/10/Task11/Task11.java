import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class Task11 {
    public static void main(String[] args) {
        File f;
        Scanner sc;
        try {
            f = new File("C:\\Users\\19101196\\Desktop\\Lab10 27-11-2019\\Task 11\\Input.txt");
            sc = new Scanner(f);
            int sum = 0;
            while(sc.hasNext()){
                sum+=Integer.parseInt(sc.next());
            }
            out.println(sum);
        }
        catch(FileNotFoundException a) {
            err.println("File not found");
        }
    }
}