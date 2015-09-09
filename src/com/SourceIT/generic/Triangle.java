package com.SourceIT.generic;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 *
 * Примем, что центром треугольника ABC будет точка пересечения медиан D
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
        System.out.println(" Center  : " + this.center);

    }

    @Override
    public void move(double xShift, double yShift) {
        this.a.movePoint(xShift, yShift);
        this.b.movePoint(xShift, yShift);
        this.c.movePoint(xShift, yShift);
    }

    //для того, что бы масштабировать треугольник, нужно его центр поместить в начало координат,
    // а затем, промасштабировав, вернуть на место
    @Override
    public void zoom(double times) {
        //получаем координаты векторов от углов к центру
        double vectorADx = this.center.getX() - this.a.getX();
        double vectorADy = this.center.getY() - this.a.getY();
        double vectorBDx = this.center.getX() - this.b.getX();
        double vectorBDy = this.center.getY() - this.b.getY();
        double vectorCDx = this.center.getX() - this.c.getX();
        double vectorCDy = this.center.getY() - this.c.getY();

        //вычисляем временные координаты вершин треугольника, при условии смещения центра D в точку 0,0
        Point a_tmp = new Point(0 - vectorADx, 0 - vectorADy);
        Point b_tmp = new Point(0 - vectorBDx, 0 - vectorBDy);
        Point c_tmp = new Point(0 - vectorCDx, 0 - vectorCDy);

        //вычисляем новые временные координаты после масштабирования
        Point a_tmp_zoom = new Point(a_tmp.getX() * times, a_tmp.getY() * times);
        Point b_tmp_zoom = new Point(b_tmp.getX() * times, b_tmp.getY() * times);
        Point c_tmp_zoom = new Point(c_tmp.getX() * times, c_tmp.getY() * times);

        //получаем новые координаты векторов от углов к центру после масштабирования (D={0;0})
        double vectorADx_new = 0 - a_tmp_zoom.getX();
        double vectorADy_new = 0 - a_tmp_zoom.getY();
        double vectorBDx_new = 0 - b_tmp_zoom.getX();
        double vectorBDy_new = 0 - b_tmp_zoom.getY();
        double vectorCDx_new = 0 - c_tmp_zoom.getX();
        double vectorCDy_new = 0 - c_tmp_zoom.getY();

        //возвращем отмасштабированный треугольник на место (к его оригинальной центральной точке)
        this.a.setX(this.center.getX() - vectorADx_new);
        this.a.setY(this.center.getY() - vectorADy_new);
        this.b.setX(this.center.getX() - vectorBDx_new);
        this.b.setY(this.center.getY() - vectorBDy_new);
        this.c.setX(this.center.getX() - vectorCDx_new);
        this.c.setY(this.center.getY() - vectorCDy_new);
    }
}
