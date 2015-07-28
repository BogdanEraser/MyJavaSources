package com.SourceIT.Lesson_03;

import java.util.Arrays;

/**
 * Created by Bogdan Kukharskiy on 28.07.15.
 *
 * Создает целый массив из 100 элементов и заполняет его простыми числами: 2, 3, 5, 7, 11, 13, 17,...
 */
public class task_07
{
    public static boolean isPrimeFaster(int n) {
        if ((n!=2) && (n%2==0)) return false;  //если это не число 2 и делится на 2 без остатка - значит точно не простое
        for(int i=3;i*i<=n;i+=2) {  // проверяем только нечетные с шагом 2
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        int[] ar = new int[100];
        short i = 2;
        for (byte j = 0; j < 100;)
        {
            if (isPrimeFaster(i)) {
                ar[j]=i;
                j++;
            }
            i++;
        }

        System.out.println(Arrays.toString(ar));

    }
}
