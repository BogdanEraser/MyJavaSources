package com.SourceIT.Lesson_06;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 */
public class Circle extends Figura {
    int radius;

    public Circle(int cX, int cY, int radius) {
        centrX = cX;
        centrY = cY;
        this.radius = radius;
    }

    @Override
    public void resize(int cratnost) {
        this.radius *= cratnost;
    }

    @Override
    public String toString() {
        return " Circle{" +
                "centr=" + super.centrX +"," + super.centrY +
                ", radius=" + radius +
                '}';
    }
}
