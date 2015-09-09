package com.SourceIT.generic;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 *
 * Примем, что центром треугольника будет точка пересечения медиан
 */
public class Triangle extends Figure {

    protected Point a;
    protected Point b;
    protected Point c;

    public Triangle(double ax, double ay, double bx, double by, double cx, double cy) {
        super((ax + bx + cx) / 3, (ay + by + cy) / 3);  //задаем центр как точку пересечения медиан
        this.a = new Point(ax, ay);
        this.b = new Point(bx, by);
        this.c = new Point(cx, cy);
    }

    @Override
    public void print() {
        System.out.println("Triangle");
        System.out.println(" Point A : " + this.a);
        System.out.println(" Point B : " + this.b);
        System.out.println(" Point C : " + this.c);
    }

    @Override
    public void move(double xShift, double yShift) {
        this.a.movePoint(xShift, yShift);
        this.b.movePoint(xShift, yShift);
        this.c.movePoint(xShift, yShift);
    }

    @Override
    public void zoom(double times) {

    }
}
