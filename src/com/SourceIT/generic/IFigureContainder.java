package com.SourceIT.generic;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 */
public interface IFigureContainder {
    void move(double xShift, double yShift);
    void printAll();

    void moveAll(double dx, double dy);
}
