package com.SourceIT.Lesson_04;

import java.util.Arrays;

/**
 * Created by Bogdan Kukharskiy on 05.08.2015.
 * Создать класс "Вектор" для хранения ссылок на объекты.
 * Класс должен иметь следующие поля:
 * 1) массив ссылок, который может расти;
 * 2) количество ссылок в массиве.
 * Класс должен иметь следующие методы:
 * 1) очистить весь массив;
 * 2) добавить ссылку в массив;
 * 3) Получить j-й элемент;
 * 4) Удалить j-й элемент;
 * 5) вывести значения массива на экран.
 */
public class Vector {

    private int quantity;
    private String[] v;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //вроде как конструкторы
    public Vector() {
        this.quantity = 0;
        this.v = new String[1];
    }

    public Vector(String[] v) {
        this.quantity = v.length;
        this.v = v;
    }

    //очистка массива
    public void destroy() {
//        for (int i = 0; i < this.v.length; i++) {
//            this.v[i] = null;
//        }
        this.quantity = 0;
        this.v = null;
    }


    //добавление элемента
    public void add(String s) {
        if (this.quantity == 0) {this.v[0] = s;}
        else {
            String[] tmp = new String[this.quantity+1];
            for (int i = 0; i < this.v.length; i++) {
                tmp[i] = this.v[i];
            }
            tmp[this.quantity+1] = s;
            this.v = tmp.clone();
        }
        this.quantity++;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "quantity=" + quantity +
                ", v=" + Arrays.toString(v) +
                '}';
    }
}
