import static java.lang.System.*;
import java.io.*;
import java.util.*;
public class Task {
    public static void main(String[] args) {
        File f;
        Scanner sc;
        try {
            f = new File("StudentDB.txt");
            sc = new Scanner(f);
            int a = Integer.parseInt(sc.nextLine());
            Student[] s = new Student[a];
            for(int i = 0; i < s.length; ++i){
                StringTokenizer st = new StringTokenizer(sc.nextLine(), ",");
                s[i] = new Student(st.nextToken(), st.nextToken(), st.nextToken(), st.nextToken());
            }
            for(int i = 0; i < s.length; ++i){
                s[i].print();
            }
        }
        catch(FileNotFoundException a) {
            err.println("File not found");
        }
        catch(Exception a) {
            err.println("Something went wrong");
        }
    }
}