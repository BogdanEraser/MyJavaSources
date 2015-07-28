package com.SourceIT.Lesson_03;

import java.util.Arrays;

/**
 * Created by Bogdan Kukharskiy on 28.07.15.
 *
 * Создает "треугольный" массив из 10 строк и заполняет его биномиальными коэффициентами (треугольник Паскаля)
 */
public class task_10
{
    public static int factorial(int n)
    {
        if (n < 0) return 0;    //что бы не повадно было считать факториал отрицательных чисел
        if (n == 0) return 1;
        return n * factorial(n-1);
    }

    public static void main(String[] args)
    {
//        String[] ar = new String[100];
//        Arrays.fill(ar, (char) 0x20);
//        ar[0] = "1";
        int[][] ar = new int[100][100];
        for (int n = 0; n < 10; n++)
        {
            for (int m = 0; m < 10; m++)
            {
                ar[n][m] = factorial(n)/(factorial(m)*factorial((n-m)));
            }
        }
    }
}
