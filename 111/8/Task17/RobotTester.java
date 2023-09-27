import static java.lang.System.*;
import java.util.*;
public class RobotTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        out.println("Please enter the grid dimesions for your Robot to move: ");
        Grid g = new Grid(sc.next(), sc.next());
        out.println("Please enter the initial position and the orientation for your Robot: ");
        Robot a = new Robot(sc.next(), sc.next(), sc.next());
        out.println("Please provide instructions to your Robot: ");
        a.move(sc.next());
        sc.close();
    }
}