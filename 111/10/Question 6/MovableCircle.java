public class MovableCircle extends MovablePoint implements Movable {
    int radius;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    public void moveUp(){
        y+=ySpeed;
    }
    public void moveDown(){
        y-=ySpeed;
    }
    public void moveLeft(){
        x-=xSpeed;
    }
    public void moveRight(){
        x+=xSpeed;
    }
}