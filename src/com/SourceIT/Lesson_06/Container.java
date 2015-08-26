package com.SourceIT.Lesson_06;

import java.util.LinkedList;

/**
 * Created by Bogdan Kukharskiy on 15.08.2015.
 */
public class Container<T extends Figura> {
    private LinkedList<T> tList;

    public Container() {
        this.tList = new LinkedList<T>();
    }

    public T getElement(int index) {
        return tList.get(index);
    }

    public void addElement(T value) {
        this.tList.add(value);
    }

    public void resizeAll(int cratnost) {
        for (int i = 0; i < this.tList.size(); i++) {
            tList.get(i).resize(cratnost);
        }
    }
}
