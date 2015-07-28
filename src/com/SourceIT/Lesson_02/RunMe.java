package com.SourceIT.Lesson_02;

/**
 * Created by Bogdan Kukharskiy on 23.07.2015.
 */
public class RunMe
{
    public static void main(String[] args)
    {
        Balloon bl1 = new Balloon();
        Balloon bl2 = new Balloon(250);
        System.out.println("Хэш-код объекта 1 = "+bl1.hashCode());
        System.out.println("Хэш-код объекта 2 = "+bl2.hashCode());
        System.out.println("Объект 1 равен объекту 2 ? "+bl1.equals(bl2));
        System.out.println("Имя: "+bl1.getName());
    }
}
