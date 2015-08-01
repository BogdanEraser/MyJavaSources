package com.SourceIT.Lesson_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Bogdan Kukharskiy on 27.07.15.
 * <p>
 * Сумма цифр произвольного целого числа
 */
public class task_02 {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        String n1 = rd.readLine();

        int sum = 0;
        if (n1.length() >= 0) {
            for (int i = 0; i < n1.length(); i++) {
                sum = sum + Integer.parseInt(n1.substring(i, i + 1));
            }
            System.out.println("Сумма цифр числа " + n1 + " = " + sum);
        } else System.out.println("Недопустимое число");

    }
}
