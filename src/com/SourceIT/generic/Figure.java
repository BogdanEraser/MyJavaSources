package com.SourceIT.generic;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 */
public abstract class Figure {
    protected Point center;

//    public Figure(Point center) {
//        this.center = center;
//    }

    public Figure(double x, double y) {
        this.center = new Point(x,y);
    }

    protected void moveCenter(double xShift, double yShift){
        center.movePoint(xShift, yShift);
    }

    public void print(){
        System.out.println(" Center : "+center);
    }
    public abstract void move(double xShift, double yShift);
    public abstract void zoom(int times);
}
