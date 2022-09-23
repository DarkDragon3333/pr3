package ru.mirea.pr3.num3;

public class Rectangle extends Shape {
    public double width;
    public double length;

    public Rectangle() {
        this.filled = false;
        this.color = "blue";
        width = 1;
        length = 2;
    }

    public Rectangle(double w, double l) {
        this.filled = false;
        this.color = "blue";
        this.width = w;
        this.length = l;
    }


    public Rectangle(double width, double length, String color, boolean filled) {
        this.length = length;
        this.width = width;
        this.color = color;
        this.filled = filled;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString() {
        return "Shape: Rectangle, Area = " + this.getArea() + ", Perimeter = " + this.getPerimeter() + ", color: " + this.color;
    }
}
