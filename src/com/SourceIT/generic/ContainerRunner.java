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
        fc.addFigure(new Triangle(-3, -2, 0, 6, 5, -1));
        fc.printAll();

        //выполняем действия с каждой фигурой по отдельности
        fc.getFigures().get(0).move(1, 1);      //передвигаем первую фигуру в списке
        fc.getFigures().get(1).zoom(0.5);       //а вторую уменьшаем на 50 %
        fc.getFigures().get(2).zoom(2);         //а третьую увеличиваем в 2 раза
        fc.getFigures().get(3).move(2, 2);      //и передвигаем четвертую фигуру в списке
        System.out.println("\n -= после 1-го преобразования =-");
        fc.printAll();

        //выполняем действия со всеми фигурами из контейнера
        fc.moveAll(5, 0);   //все двигаем
        fc.zoomAll(10);     //все масштабируем
        System.out.println("\n -= после 2-го преобразования =-");
        fc.printAll();
    }
}
