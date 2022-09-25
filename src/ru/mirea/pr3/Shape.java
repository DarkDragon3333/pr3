package ru.mirea.pr3;

public abstract class Shape {

    protected boolean filled;
    protected String color;

    public Shape() {
        this.color = "blue";
        this.filled = false;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled() {
        return this.filled;
    }

    abstract double getArea();

    abstract double getPerimeter();


}
