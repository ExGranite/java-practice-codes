import static java.lang.System.*;
import java.util.*;
public class Grid {
    protected static int length, width;
    Grid(String w, String l){
        for(int i = 0; i < 1; ){
            if(Integer.parseInt(l)>0 && Integer.parseInt(w)>0){
                setLength(l);
                setWidth(w);
                i++;
            }else{
                err.println("Invalid Dimension! Your grid should have a positive dimensional area which cannot be 0!");
                out.println("Please re-enter your dimensions: ");
                Scanner sc = new Scanner(in);
                l = sc.next();
                w = sc.next();
                sc.close();
            }
        }
    }
    Grid(){}
    public void setLength(String l){
        length = Integer.parseInt(l);
    }
    public void setWidth(String w){
        width = Integer.parseInt(w);
    }
}