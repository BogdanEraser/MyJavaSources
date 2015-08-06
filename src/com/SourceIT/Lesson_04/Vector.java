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
        this.quantity = 0;
        this.v = null;
    }

    //добавление элемента
    public void add(String s) {
        if (this.quantity == 0) {
            this.v[0] = s;
        } else {
            String[] tmp = new String[this.v.length + 1];
            System.arraycopy(this.v, 0, tmp, 0, this.v.length);
            tmp[this.v.length] = s;
            this.v = tmp.clone();
            tmp = null;   //не уверен, что нужно, но зачем-то обнуляю ссылку на временный массив
        }
        this.quantity++;
    }

    //получение j-го элемента
    public String showElement(int j) {
        if (j >= this.v.length) {
            return "Данный элемент недоступен";
        }
        if (this.quantity == 0) {return "Массив пуст";}
        else {
            return this.v[j];
        }
    }

    //удаление j-го элемента
    public void deleteElement(int j) {
        if ((j >= 0) && (j < this.v.length)) {
            if (this.v.length == 1) {
                this.v[0] = null; //удаление единственного, 0-го элемента
                this.quantity = 0;
            }
            else {
                String[] tmp = new String[this.v.length-1];
                System.arraycopy(this.v, 0, tmp, 0, j);
                System.arraycopy(this.v, j+1, tmp, j, this.v.length-(j+1));
                this.v = tmp.clone();
                tmp = null;   //не уверен, что нужно, но зачем-то обнуляю ссылку на временный массив
                this.quantity--;
            }
        }
    }

    @Override
    public String toString() {
        return "Vector{" +
                "quantity=" + quantity +
                ", v=" + Arrays.toString(v) +
                '}';
    }
}
