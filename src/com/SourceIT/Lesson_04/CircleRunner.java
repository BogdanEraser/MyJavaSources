package com.SourceIT.Lesson_04;

/**
 * Created by Bogdan Kukharskiy on 31.07.15.
 */
public class CircleRunner
{
    public static void main(String[] args)
    {
        Circle A = new Circle(0,0,10);  //создаем
        System.out.println(A);
        A.isPointInCircle(5, 4);    //проверяем, принадлежит ли произвольная точка кругу

        A.move(10, 10);    //передвигаем
        System.out.println(A);
        A.isPointInCircle(2, 2);    //еще раз проверяем, принадлежит ли произвольная точка кругу

        Circle B = new Circle(8,7,2);  //создаем другой круг
        A.isCircleInCircle(B);      //проверяем принадлежность первому кругу

    }
}
