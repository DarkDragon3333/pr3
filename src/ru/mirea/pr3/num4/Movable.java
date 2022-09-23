package ru.mirea.pr3.num4;

public interface Movable {
    void Up();
    void Down();
    void Left();
    void Right();

    static void main(String[] args){
        MovablePoint p = new MovablePoint(5, 5, 6, 7);
        p.Down();
        p.Left();
        System.out.println();

        MovableCircle c = new MovableCircle(6, 3, 1, 2000);
        c.Up();
        c.Right();
    }
}
