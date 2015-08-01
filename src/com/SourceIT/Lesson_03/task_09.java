package com.SourceIT.Lesson_03;

import java.util.Arrays;

/**
 * Created by Bogdan Kukharskiy on 28.07.15.
 * <p>
 * Создать целый шестимерный массив с двумя значениями в каждом измерении.
 * Заполнить массив числами из начала натурального ряда: 1, 2, 3, …
 * Сказать, сколько потребуется чисел ?  ===== ОТВЕТ: 2 в 6-й степени = 64 =====
 */
public class task_09 {
    public static void main(String[] args) {
        int[][][][][][] ar1 = new int[2][2][2][2][2][2];
        int ch = 1;
        for (int a = 0; a < 2; a++) {
            int[][][][][] ar2 = ar1[a];
            for (int b = 0; b < 2; b++) {
                int[][][][] ar3 = ar2[b];
                for (int c = 0; c < 2; c++) {
                    int[][][] ar4 = ar3[c];
                    for (int d = 0; d < 2; d++) {
                        int[][] ar5 = ar4[d];
                        for (int e = 0; e < 2; e++) {
                            int[] ar6 = ar5[e];
                            for (int f = 0; f < 2; f++) {
                                ar6[f] = ch;
                                ch++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Потребовалось " + (ch - 1) + " чисел"); //минус 1 потому что отсчет начали с единицы
        System.out.println(Arrays.deepToString(ar1));
    }
}
