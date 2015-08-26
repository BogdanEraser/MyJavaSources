package com.SourceIT.generic;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 */
public class FigureContainer<T extends Figure> implements IFigureContainder{
    private LinkedList<T> figures;

    public FigureContainer() {
        this.figures = new LinkedList<>();
    }

    public void addFigure(T f) {
        figures.add(f);
    }

    public List<T> getFigures() {
        return figures;
    }

    @Override
    public void move(double xShift, double yShift) {
        for (T fig:figures) {
            fig.move(xShift, yShift);
        }
    }

    @Override
    public void printAll() {
        for (T fig:figures) {
            fig.print();
        }
    }

}