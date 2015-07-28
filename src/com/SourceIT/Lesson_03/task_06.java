package com.SourceIT.Lesson_03;

import java.util.Arrays;

/**
 * Created by Bogdan Kukharskiy on 27.07.2015.
 * Размещает в памяти массив из 20 элементов и заполняет его рядом Фиббоначчи: 1, 1, 2, 3, 5, 8, 13, 21, …
 * В этом ряду каждое следующее число является суммой двух предыдущих.
 */
public class task_06
{
    public static void main(String[] args)
    {
        int[] ar = new int[20];
        ar[0] = 1;
        ar[1] = 1;
        for (int i = 2; i < 20; i++)
        {
            ar[i] = ar[i-1]+ar[i-2];
        }
        System.out.println(Arrays.toString(ar));
    }
}
