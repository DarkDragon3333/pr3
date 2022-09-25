package ru.mirea.pr3;

public class Square extends Rectangle {
    public double side;

    public Square() {
        this.color = "blue";
        this.filled = false;
        this.side = 2.2;
    }

    public Square(double side) {
        this.color = "blue";
        this.filled = false;
        this.side = side;
    }

    public Square(double side, String c, boolean f) {
        this.color = c;
        this.filled = f;
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
    }

    @Override
    public String toString() {
        return "Square, side: " + side + ", color: " + color + ", filled: " + filled;
    }
}
