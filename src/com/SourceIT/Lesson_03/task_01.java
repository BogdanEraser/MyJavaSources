package com.SourceIT.Lesson_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Bogdan Kukharskiy on 27.07.15.
 *
 * Наибольший общий делитель для 2-х целых положительных чисел
 */
public class task_01
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        long n1 = Long.parseLong(rd.readLine());
        long n2 = Long.parseLong(rd.readLine());
        if ((n1 > 0) && (n2 > 0))
        {
            if (n1==n2) System.out.println("НОД чисел "+n1+" и "+n2+" = "+n1);
            else System.out.println(getNOD(n1, n2));
        }
        else System.out.println("Введенные числа меньше или равны 0");
    }

    private static long getNOD(long a, long b) {
        if (b == 0)
            return a;
        else
            return getNOD(b, a % b);
    }
}
