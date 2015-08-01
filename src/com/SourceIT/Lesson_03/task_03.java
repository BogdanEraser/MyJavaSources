package com.SourceIT.Lesson_03;

/**
 * Created by Bogdan Kukharskiy on 27.07.15.
 * <p>
 * Проверка того, что заданное число Х – простое (т.е. не делится без остатка ни на какие числа, кроме себя и 1).
 * Число задается в программе .
 * <p>
 * ===== 0 и 1 НЕ проверяем =======
 */
public class task_03 {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {      //начинаем с 2-х и проверяем остаток от деления на 2 все подряд
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static boolean isPrimeFaster(int n) {
        if ((n != 2) && (n % 2 == 0))
            return false;  //если это не число 2 и делится на 2 без остатка - значит точно не простое
        for (int i = 3; i * i <= n; i += 2) {  // проверяем только нечетные с шагом 2
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n1 = 205;
        long start = System.nanoTime();
        if (isPrime(n1)) System.out.println("Число " + n1 + " простое");
        else System.out.println("Число " + n1 + " не простое");
        long end = System.nanoTime();
        System.out.println("Время выполнения: " + (double) (end - start) / 1000000.0 + " миллисекунд");

        long start2 = System.nanoTime();
        if (isPrimeFaster(n1)) System.out.println("Число " + n1 + " простое");
        else System.out.println("Число " + n1 + " не простое");
        long end2 = System.nanoTime();
        System.out.println("Время выполнения: " + (double) (end2 - start2) / 1000000.0 + " миллисекунд");

    }
}
