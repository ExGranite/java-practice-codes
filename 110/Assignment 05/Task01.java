import static java.lang.System.*;
import java.util.*;
public class Task01 {
     public static void main (String[] args) {
          Scanner scanner = new Scanner (in);
          int[] marks = new int[] {10, 30, 20, 50, 40};
          int max = marks[0], min = marks[0], sum = marks[0];
          for ( int i = 1; i <= 4; ++i) {
              sum += marks[i];
              if ( marks[i] > max )
                  max = marks[i];
              if ( marks[i] < min )
                  min = marks[i];
          }
          double avg = (1.0 * sum)/5;
          System.out.printf("Maximum: %d%nMinimum: %d%nAverage: %.2f%n", max, min, avg);
     }
}