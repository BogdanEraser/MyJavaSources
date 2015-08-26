package com.SourceIT.Lesson_06;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 */
public class Square extends Figura {
    int height;
    int width;

    public Square(int cX, int cY, int height, int width) {
        centrX = cX;
        centrY = cY;
        this.height = height;
        this.width = width;
    }

    @Override
    public void resize(int cratnost) {
        this.height *= cratnost;
        this.width *= cratnost;
    }

    @Override
    public String toString() {
        return super.toString() + " Square{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}
