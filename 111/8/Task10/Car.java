public class Car {
    int year;
    static int objectCount = 0;
    Car(int a){
        year = a;
        objectCount++;
    }
    int getYear(){
        return year;
    }
    public static int getObjectCount(){
        return objectCount;
    }
}
