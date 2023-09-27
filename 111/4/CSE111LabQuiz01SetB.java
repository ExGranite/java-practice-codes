import static java.lang.System.*;
import java.util.*;
public class CSE111LabQuiz01SetB {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        out.print("Please enter the number of football clubs: ");
        int clubs = scanner.nextInt();
        out.print("Please enter the number of seasons you want to consider: ");
        int season = scanner.nextInt();
        String[] a = new String[(clubs*season) + clubs];
        scanner.nextLine();
        for (int i = 0; i < a.length; ++i) {
            out.print("Please enter the name of club: ");
            a[i] = scanner.nextLine();
            out.printf("Please enter the scores of each of the %d season(s):%n", season);
            for (int j = 0; j < season; ++j) {
                ++i;
                a[i] = scanner.nextLine();
            }
        }
        int seasonCount = 1;
        for (int i = 0; i < a.length; ++i) {
            double sum = 0;
            for (int j = 0; j < season; ++j) {
                ++i;
                sum += Double.parseDouble(a[i]);
            }
            double avg = sum/season;
            out.printf("Season %d's Avg: %f%n",seasonCount, avg);
            ++seasonCount;
        }
    }
}