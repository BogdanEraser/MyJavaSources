package com.SourceIT.Lesson_06;

import java.util.ArrayList;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 */
public class ContainerRunner {
    public static void main(String[] args) {
        Container<Circle> container = new Container();
        container.addElement(new Circle(3, 3, 3));
        container.addElement(new Circle(1, 1, 10));
        System.out.println(container.getElement(0));
        System.out.println(container.getElement(1));
        System.out.println("Увеличиваем в два раза");
        container.getElement(0).resize(2);
        System.out.println(container.getElement(0));
        //container.addElement(new Square(2,2,4,4));


    }
}
