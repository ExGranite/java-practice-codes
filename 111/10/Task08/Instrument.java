abstract class Instrument{
    abstract void play();
    abstract void adjust();
    void compose(){
        System.out.print("In the compose method of ");
    }
}