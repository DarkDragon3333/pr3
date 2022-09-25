package ru.mirea.pr3;

public class MovableCircle implements Movable {
    MovablePoint center = new MovablePoint(5, 5, 6, 7);
    int radius = 0;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed){
        this.center.x = x;
        this.center.xSpeed = xSpeed;
        this.center.y = y;
        this.center.ySpeed = ySpeed;
    }

    @Override
    public void Up() {
        System.out.println("Circle took a step наверх");
    }

    @Override
    public void Down() {
        System.out.println("Circle took a step наверх");
    }

    @Override
    public void Left() {
        System.out.println("Circle took a step наверх");
    }

    @Override
    public void Right() {
        System.out.println("Circle took a step наверх");
    }
}