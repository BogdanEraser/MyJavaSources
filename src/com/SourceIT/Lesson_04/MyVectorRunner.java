package com.SourceIT.Lesson_04;

/**
 * Created by Bogdan Kukharskiy on 05.08.2015.
 */
public class MyVectorRunner {
    public static void main(String[] args) {
        Vector mas = new Vector();
        mas.add("qwe0");        //добавляем элементы
        mas.add("asd1");
        mas.add("zxc2");
        mas.add("rty3");
        System.out.println(mas);    //отображаем
        int j = 1;  //задаем произвольное j
        System.out.println("Элемент " + j + " = " + mas.showElement(j)); //получаем j-й элемент

        mas.deleteElement(j);       //удаляем j-й элемент
        System.out.println(mas);    //отображаем

        System.out.println("Элемент " + j + " = " + mas.showElement(j)); //получаем j-й элемент
        mas.destroy();  //очищаем
        System.out.println(mas);    //отображаем
    }
}
