package com.SourceIT.Lesson_03;

import java.util.Arrays;

/**
 * Created by Bogdan Kukharskiy on 28.07.15.
 *
 * Создает двумерный массив символов и заполняет его буквами 'Ч' и 'Б' в шахматном порядке.
 */
public class task_08
{
    public static void main(String[] args)
    {
        String[][] ar = new String[8][8];  //например, размерами с шахматную доску
        boolean c = true;
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                if (c) ar[i][j] = "Ч";
                else ar[i][j] = "Б";
                c=!c;
            }
            c=!c;
        }

        //типа красиво выводим на экран
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }

    }
}
