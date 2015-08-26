package com.SourceIT.generic;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 */
public class Circle extends Figure{
    protected double radius;

    public Circle(double x, double y) {
        super(x, y);
    }

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public void print() {
        System.out.println("Circle");
        super.print();
        System.out.println(" Radius : "+radius);
    }

    @Override
    public void move(double xShift, double yShift) {
        this.center.movePoint(xShift,yShift);
    }

    @Override
    public void zoom(int times) {
        this.radius*=times;
    }
}
