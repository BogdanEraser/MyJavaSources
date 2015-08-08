package com.SourceIT.Lesson_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Bogdan Kukharskiy on 07.08.15.
 */
public class MatrixRunner
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите количество столбцов матрицы А");
        int colA = Integer.parseInt(rd.readLine());
        System.out.println("Введите количество строк матрицы А");
        int rowA = Integer.parseInt(rd.readLine());

        float[][] masA = new float[colA][rowA];     //генерируем значения для матрицы А
        for (int i = 0; i < colA; i++) {
            for (int j = 0; j < rowA; j++) {
                masA[i][j]=(float)(Math.random()*10+2.5);
            }
        }

        System.out.println("Введите количество столбцов матрицы B");
        int colB = Integer.parseInt(rd.readLine());
        System.out.println("Введите количество строк матрицы B");
        int rowB = Integer.parseInt(rd.readLine());

        float[][] masB = new float[colB][rowB];     //генерируем значения для матрицы B
        for (int i = 0; i < colB; i++) {
            for (int j = 0; j < rowB; j++) {
                masB[i][j]=(float)(Math.random()*10+2.5);
            }
        }

        Matrix a = new Matrix(colA, rowA, masA);
        System.out.println("Сгенерированная матрица А");
        System.out.println(a);

        Matrix b = new Matrix(colB,rowB,masB);
        System.out.println("Сгенерированная матрица B");
        System.out.println(b);

        Matrix c = a.addMatrix(a, b);
        System.out.println(c);

    }
}
