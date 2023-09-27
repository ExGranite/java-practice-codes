import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class Task14 {
    public static void main(String[] args) {
        File f;
        Scanner sc = new Scanner(in);
        out.println("Please enter the file name: ");
        String a = sc.next();
        try {
            f = new File("C:\\Users\\19101196\\Desktop\\Lab10 27-11-2019\\Task 14\\"+a+".txt");
            sc = new Scanner(f);
            while(sc.hasNextLine()){
                out.println(sc.nextLine());
            }
        }
        catch(FileNotFoundException z) {
            err.println("File not found");
        }
    }
}