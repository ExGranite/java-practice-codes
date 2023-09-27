import static java.lang.System.*;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        Student[] a = new Student[3];
        for(int i = 0; i < a.length; i++){
            out.println("Please enter the name, ID and address for Student number "+(i+1));
            a[i] = new Student(new Scanner(in).nextLine(), new Scanner(in).nextLine(), new Scanner(in).nextLine());
        }
        for(int i = 0; i < a.length-1; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[i].name.charAt(0)>a[j].name.charAt(0)){
                    Student temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        out.println("The Student list in alphatebical order:");
        for(int i = 0; i < a.length; i++){
            out.printf("Name: %s%nID: %s%nAddress: %s%n", a[i].name, a[i].id, a[i].address);
            if(i!=a.length-1){
                out.println();
            }
        }
    }
}