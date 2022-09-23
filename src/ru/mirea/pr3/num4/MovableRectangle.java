package ru.mirea.pr3.num4;

public class MovableRectangle implements Movable{
    MovablePoint topLeft = new MovablePoint(0, 5, 4, 4);
    MovablePoint bottomRight = new MovablePoint(5, 0, 4, 4);

    public MovableRectangle(int x1, int x2, int y1, int y2, int xSpeed, int ySpeed){
        this.topLeft.x = x1;
        this.topLeft.y = y1;
        this.topLeft.xSpeed = xSpeed;
        this.topLeft.ySpeed = ySpeed;

        this.bottomRight.x = x2;
        this.bottomRight.y = y2;
        this.bottomRight.xSpeed = xSpeed;
        this.bottomRight.ySpeed = ySpeed;
    }

    @Override
    public String toString(){
        String test = (this.topLeft.xSpeed == this.bottomRight.xSpeed) ? "Nice" : "Different speed!";
        return test;
    }

    @Override
    public void Up() {
        System.out.println("Rectangle took a step up");
    }

    @Override
    public void Down() {
        System.out.println("Rectangle took a step down");
    }

    @Override
    public void Left() {
        System.out.println("Rectangle took a step left");
    }

    @Override
    public void Right() {
        System.out.println("Rectangle took a step right");
    }
}
