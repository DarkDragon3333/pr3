package ru.mirea.pr3;

public class MovablePoint implements Movable {
    int x, y, xSpeed, ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.xSpeed = xSpeed;
        this.y = y;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }

    @Override
    public void Up() {
        System.out.println("Point took a step up");
    }

    @Override
    public void Down() {
        System.out.println("Point took a step down");
    }

    @Override
    public void Left() {
        System.out.println("Point took a step left");
    }

    @Override
    public void Right() {
        System.out.println("Point took a step right");
    }
}
