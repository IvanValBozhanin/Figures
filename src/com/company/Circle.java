package com.company;

public class Circle extends Figure{
    private double x, y, r;

    public Circle() {
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    public Circle(Circle circle) {
        this.x = circle.x;
        this.y = circle.y;
        this.r = circle.r;
    }

    @Override
    public double surface() {
        return Math.PI*r*r;
    }

    @Override
    public double perimeter() {
        return Math.PI*2*r;
    }

    @Override
    public void info() {
        System.out.println( "Circle{" +
                "x=" + x +
                ", y=" + y +
                ", r=" + r +
                '}');

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
