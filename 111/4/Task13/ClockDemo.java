public class ClockDemo {
    public static void main(String[] args){
        Clock firstClock = new Clock(2465);
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println(firstClock.getHours()+" hours "+firstClock.getMinutes()+" minutes "+firstClock.getSeconds()+" seconds");
        }
        Clock secondClock = new Clock(2, 14, 4);
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            System.out.println(secondClock.getHours()+" hours "+secondClock.getMinutes()+" minutes "+secondClock.getSeconds()+" seconds");
        }
        firstClock.addClock(secondClock);
        System.out.println(firstClock.toString());
        System.out.println(secondClock.toString());
    }
}