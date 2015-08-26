package com.SourceIT.generic;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
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
    public void movePoint(double xShift, double yShift){
        this.x+=xShift;
        this.y+=yShift;
    }

    @Override
    public String toString() {
        return  "x = " + x +
                ", y = " + y +
                '}';
    }
}
