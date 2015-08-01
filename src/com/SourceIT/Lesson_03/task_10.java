package com.SourceIT.Lesson_03;

import java.util.Arrays;

/**
 * Created by Bogdan Kukharskiy on 28.07.15.
 * <p>
 * Создает "треугольный" массив из 10 строк и заполняет его биномиальными коэффициентами (треугольник Паскаля)
 */
public class task_10 {
    public static int factorial(int n) {
        if (n < 0) return 0;    //что бы не повадно было считать факториал отрицательных чисел
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        int[][] ar = new int[10][10];
        for (int n = 0; n < 10; n++) {
            for (int m = 0; m < n + 1; m++) {
                ar[n][m] = factorial(n) / (factorial(m) * factorial((n - m)));
            }
        }

        //полученный результат
        System.out.println(Arrays.deepToString(ar));
        System.out.println();

        //а теперь выведем его красиво
        for (int i = 0; i < ar.length; i++) {
            int[] ch = ar[i];
            for (int j = 0; j < (10 - i) / 2; j++) {
                System.out.print("    ");
            }
            if (i % 2 == 1) {
                System.out.print("  ");
            }
            for (int j = 0; j < i + 1; j++) {
                if (ch[i] != 0) System.out.format("%-4d", ch[j]);
            }
            System.out.println();
        }
    }
}
