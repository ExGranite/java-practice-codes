public class Vehicle2010 extends Vehicle {
    void moveUpperRight(){
        moveUp(); moveRight();
    }
    void moveUpperLeft(){
        moveUp(); moveLeft();
    }
    void moveLowerRight(){
        moveDown(); moveRight();
    }
    void moveLowerLeft(){
        moveDown(); moveLeft();
    }
    boolean equals(Vehicle2010 a){
        if(x==a.x&&y==a.y){
            return true;
        }
        return false;
    }
}
