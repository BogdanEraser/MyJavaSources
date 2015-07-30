package com.SourceIT.Lesson_03;

/**
 * Created by Bogdan Kukharskiy on 27.07.15.
 * Считает сумму ряда 1! - 2! + 3! – 4! + 5! - … + n! для заданного числа n > 0..
 */
public class task_04
{
    static int calc(int n){
        int sum = 0;
        int sign = 1;
        int mult = 1;
        for (int i = 1; i <= n; i++)
        {
            sum=sum+sign*mult*i;
            mult=mult*i;
            sign=sign*-1;
        }
        return sum;
    }
    
    
    public static void main(String[] args)
    {
        int n1 = 19;
        System.out.println("Сумма ряда для " + n1 + " = " + calc(n1));

    }
}
