import static java.lang.System.*;
import java.util.*;
public class Robot extends Grid{
    private int x, y;
    private String orientation;
    char[] g = {'N','E','S','W'};
    private int gIndex;
    private boolean Lost = false;
    Scanner sc = new Scanner(in);
    Robot(String x, String y, String o){
        for(int i = 0; i < 1; ){
            if(Integer.parseInt(x)<=width && Integer.parseInt(x)>=0){
                setX(x);
                i++;
            }else{
                err.println("Invalid Position! The x-cordinate of the initial position of your Robot must be within the grid you provided!");
                out.println("Please re-enter a correct x-cordinate for your Robot: ");
                x = sc.next();
            }
        }
        for(int i = 0; i < 1; ){
            if(Integer.parseInt(y)<=length && Integer.parseInt(y)>=0){
                setY(y);
                i++;
            }else{
                err.println("Invalid Position! The y-cordinate of the initial position of your Robot must be within the grid you provided!");
                out.println("Please re-enter a correct y-cordinate for your Robot: ");
                y = sc.next();
            }
        }
        for(int i = 0; i < 1; ){
            if(o.equals("N") || o.equals("E") || o.equals("W") || o.equals("S")){
                setOrientation(o);
                i++;
            }else{
                err.println("Invalid Orientation!");
                out.println("Please re-enter a correct orientation for your Robot: ");
                o = sc.nextLine();
            }
        }
    }
    private void setX(String x){
        this.x = Integer.parseInt(x);
    }
    private void setY(String y){
        this.y = Integer.parseInt(y);
    }
    private void setOrientation(String o){
        if(o.equals("N")){
            gIndex = 0;
        } else if(o.equals("E")){
            gIndex = 1;
        } else if(o.equals("W")){
            gIndex = 3;
        } else if(o.equals("S")){
            gIndex = 2;
        }
        orientation = String.valueOf(g[gIndex]);
    }
    public void moveForward(){
        int tempx = x;
        int tempy = y;
        if(gIndex==0){
            tempy++;
        } else if(gIndex==1){
            tempx++;
        } else if(gIndex==3){
            tempx--;
        } else if(gIndex==2){
            tempy--;
        }
        if(tempx>width || tempy>length || tempx<0 || tempy<0){
            Lost = true;
        }else{
            x = tempx; y = tempy;
        }
    }
    public void print(){
        if(Lost){
            out.printf("The position of your Robot was (%d, %d) and had orientation %s before getting LOST%n", x, y, orientation);
        }else{
            out.printf("The position of your Robot is now (%d, %d) and has orientation %s%n", x, y, orientation);
        }
    }
    public void move(String a){
        char[] s = a.toCharArray();
        for(int i = 0; i < s.length; ++i){
            if(s[i]=='F' || s[i]=='L' || s[i]=='R'){
                i++;
            } else {
                err.println("You have entered some incorrect instructions. If you have forgotten, your robot can operate under instructions composed of R, L and F only.");
                out.println("Please enter a correct series of instructions: ");
                a = sc.nextLine();
                s = a.toCharArray();
                i = -1;
            }
        }
        for(int i = 0; i < s.length; ++i){
            if(Lost){
                break;
            }
            if(s[i]=='F'){
                moveForward();
            } else if(s[i]=='R'){
                if(gIndex == 3){
                    gIndex = 0;
                } else {
                    gIndex++;
                }
            } else {
                if(gIndex == 0){
                    gIndex = 3;
                } else {
                    gIndex--;
                }
            }
            orientation = String.valueOf(g[gIndex]);
        }
        print();
    }
}