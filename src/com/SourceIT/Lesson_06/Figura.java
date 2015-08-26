package com.SourceIT.Lesson_06;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 */
public abstract class Figura {
    protected int centrX;
    protected int centrY;

    public void move(int dx, int dy) {
        this.centrX += dx;
        this.centrY += dy;
    }

    public abstract void resize(int cratnost);

    @Override
    public String toString() {
        return "Figura{" +
                "centrX=" + centrX +
                ", centrY=" + centrY +
                '}';
    }
}
