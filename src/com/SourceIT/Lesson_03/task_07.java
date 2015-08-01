package com.SourceIT.Lesson_03;

import java.util.Arrays;

/**
 * Created by Bogdan Kukharskiy on 28.07.15.
 *
 * Создает целый массив из 100 элементов и заполняет его простыми числами: 2, 3, 5, 7, 11, 13, 17,...
 */
public class task_07
{
    public static void main(String[] args)
    {
        int[] ar = new int[100];
        short i = 2;
        for (byte j = 0; j < 100;)
        {
            if (task_03.isPrimeFaster(i)) {
                ar[j]=i;
                j++;
            }
            i++;
        }

        System.out.println(Arrays.toString(ar));

    }
}
