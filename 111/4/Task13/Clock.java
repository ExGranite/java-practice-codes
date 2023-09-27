public class Clock{
    private int hours, minutes, seconds;
    public Clock(){
    }
    public Clock(int h, int m, int s){
        hours = h; minutes = m; seconds = s;
    }
    public Clock(int s){
        hours = s/3600;
        minutes = (s/60) - (hours*60);
        seconds = s - (minutes*60) - (hours*3600);
    }
    public void setClock(int s){
        hours = s/3600;
        minutes = (s/60) - (hours*60);
        seconds = s - (minutes*60) - (hours*3600);
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public void setHours(int h){
        hours = h;
    }
    public void setMinutes(int m){
        minutes = m;
    }
    public void setSeconds(int s){
        seconds = s;
    }
    public void tick(){
        seconds++;
    }
    public Clock addClock(Clock c){
        hours += c.hours;
        minutes += c.minutes;
        seconds += c.seconds;
        Clock temp = new Clock(hours, minutes, seconds);
        return temp;
    }
    public String toString(){
        return hours+":"+minutes+":"+seconds;
    }
    public void tickDown(){
        seconds--;
    }
    public Clock subtractClock(Clock c){
        hours -= c.hours;
        minutes -= c.minutes;
        seconds -= c.seconds;
        Clock temp = new Clock(hours, minutes, seconds);
        return temp;
    }
}