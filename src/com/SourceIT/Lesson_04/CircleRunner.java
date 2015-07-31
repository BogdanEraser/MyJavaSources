package com.SourceIT.MyJavaSources.src.com.SourceIT.Lesson_04;

/**
 * Created by Bogdan Kukharskiy on 31.07.15.
 */
public class CircleRunner
{
    public static void main(String[] args)
    {
        Circle A = new Circle(0,0,10);  //создаем
        System.out.println(A);
        A.isPointInCircle(2, 2);

//        A.move(10, 10);    //передвигаем
//        System.out.println(A);
//        A.isPointInCircle(2, 2);

        Circle B = new Circle(1,1,9);  //создаем другой круг
        A.isCircleInCircle(B);

    }
}
