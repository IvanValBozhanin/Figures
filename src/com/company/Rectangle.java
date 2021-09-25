package com.company;

public class Rectangle extends Figure{
    private double ax, ay, bx, by, cx, cy, dx, dy;
    private double a, b, c, d;

    public Rectangle() {
        findEdges();
    }

    public Rectangle(double ax, double ay, double bx, double by, double cx, double cy, double dx, double dy) {
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
        this.cx = cx;
        this.cy = cy;
        this.dx = dx;
        this.dy = dy;
        findEdges();
    }

    public Rectangle(Rectangle square){
        this.ax = square.ax;
        this.ay = square.ay;
        this.bx = square.bx;
        this.by = square.by;
        this.cx = square.cx;
        this.cy = square.cy;
        this.dx = square.dx;
        this.dy = square.dy;
        findEdges();
    }

    private void findEdges(){
        a = Math.sqrt((ax-bx)*(ax-bx) + (ay-by)*(ay-by));
        b = Math.sqrt((cx-bx)*(cx-bx) + (cy-by)*(cy-by));
        c = Math.sqrt((cx-dx)*(cx-dx) + (cy-dy)*(cy-dy));
        d = Math.sqrt((ax-dx)*(ax-dx) + (ay-dy)*(ay-dy));
    }

    @Override
    public double surface() {
        return a*b;
    }

    @Override
    public double perimeter() {
        return (a+b)*2;
    }

    @Override
    public void info() {
        System.out.println(
                "Rectangle{" +
                        "ax=" + ax +
                        ", ay=" + ay +
                        ", bx=" + bx +
                        ", by=" + by +
                        ", cx=" + cx +
                        ", cy=" + cy +
                        ", dx=" + dx +
                        ", dy=" + dy +
                        ", a=" + a +
                        '}');
    }

    public double getAx() {
        return ax;
    }

    public void setAx(double ax) {
        this.ax = ax;
    }

    public double getAy() {
        return ay;
    }

    public void setAy(double ay) {
        this.ay = ay;
    }

    public double getBx() {
        return bx;
    }

    public void setBx(double bx) {
        this.bx = bx;
    }

    public double getBy() {
        return by;
    }

    public void setBy(double by) {
        this.by = by;
    }

    public double getCx() {
        return cx;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public double getCy() {
        return cy;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }

    public double getDx() {
        return dx;
    }

    public void setDx(double dx) {
        this.dx = dx;
    }

    public double getDy() {
        return dy;
    }

    public void setDy(double dy) {
        this.dy = dy;
    }
}
