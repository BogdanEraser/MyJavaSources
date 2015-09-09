package com.SourceIT.generic;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 */
public class ContainerRunner {
    public static void main(String[] args) {
        FigureContainer<Figure> fc = new FigureContainer();
        fc.addFigure(new Circle(3,4,5));
        fc.addFigure(new Circle(1,1,10));
        fc.addFigure(new Triangle(2, 2, 5, 5, 5, 2));
        fc.printAll();
        fc.getFigures().get(0).move(1, 1);      //передвигаем первую фигуру в списке
        fc.getFigures().get(1).zoom(0.5);       //а вторую уменьшаем на 50 %
        fc.getFigures().get(2).zoom(2);         //а третьую увеличиваем в 2 раза
        System.out.println("\n -= после преобразованиея =-");
        fc.printAll();
    }
}
