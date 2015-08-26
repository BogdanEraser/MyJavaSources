package com.SourceIT.generic;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 */
public class ContainerRunner {
    public static void main(String[] args) {
        FigureContainer<Circle> fc = new FigureContainer();
        fc.addFigure(new Circle(3,4,5));
        fc.addFigure(new Circle(1,1,10));
        fc.printAll();


    }
}
