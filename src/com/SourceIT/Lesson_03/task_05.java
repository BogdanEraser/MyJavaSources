package com.SourceIT.Lesson_03;

/**
 * Created by Bogdan Kukharskiy on 27.07.2015.
 *
 * Подсчитывает, сколько шестизначных цифр имеют равную сумму трех первых и трех последних цифр
 */
public class task_05
{
    public static void main(String[] args)
    {
        long start = System.nanoTime();
        int n = 0;
        StringBuffer c1 = new StringBuffer(6);
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 100000; i <= 999999; i++) {
            c1.append(String.valueOf(i));
            sum1 = Integer.parseInt(c1.substring(0,1))+Integer.parseInt(c1.substring(1,2))+Integer.parseInt(c1.substring(2,3));
            sum2 = Integer.parseInt(c1.substring(3,4))+Integer.parseInt(c1.substring(4,5))+Integer.parseInt(c1.substring(5,6));
            if (sum1 == sum2) {
                n++;
            }
            c1.delete(0,6);
        }
        System.out.println(n+" шестизначных цифр имеют равную сумму трех первых и трех последних цифр");
        long end = System.nanoTime();
        System.out.println("Время выполнения: "+(double)(end-start)/1000000000.0+ " наносекунд");
    }
}
