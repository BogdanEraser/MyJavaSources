package com.SourceIT.MyJavaSources.src.com.SourceIT.Lesson_04;

import java.util.Arrays;

/**
 * Created by Bogdan Kukharskiy on 07.08.15.
 * Создать класс "Матрица".
 * Класс должен иметь следующие поля:
 * 1) двумерный массив вещественных чисел;
 * 2) количество строк и столбцов в матрице.
 * Класс должен иметь следующие методы:
 * 1) сложение с другой матрицей;
 * 2) умножение на число;
 * 3) умножение на другую матрицу;
 * 4) транспонирование;
 * 5) вывод на печать.
 */
public class Matrix
{
    private int columnsCount;
    private int rowsCount;
    private float[][] m;

    public int getColumnsCount()
    {
        return this.columnsCount;
    }

    public int getRowsCount()
    {
        return this.rowsCount;
    }

    public float getElement(int i, int j)
    {
        return this.m[i][j];
    }

    //конструктор
    public Matrix(int columnsCount, int rowsCount, float[][] m)
    {
        this.columnsCount = columnsCount;
        this.rowsCount = rowsCount;
        this.m = new float[columnsCount][rowsCount];
    }

    //сложение матриц
    public Matrix addMatix(Matrix a, Matrix b)
    {
        if ((a.getColumnsCount()!=b.getColumnsCount())||(a.getRowsCount()!=b.getRowsCount()))
            {
                System.out.println("Матрицы не равны по строками и/или столцам. Сложение невозможно");
                return null;
            }
        float c[][] = new float[a.getColumnsCount()][a.getRowsCount()];
        for (int i = 0; i <(a.getRowsCount()-1); i++)
            for (int j = 0; j < (a.getColumnsCount() - 1); j++)
            {
                c[i][j] = a.getElement(i,j)+b.getElement(i,j);
            }
        return new Matrix(a.getColumnsCount(), a.getRowsCount(), c);    //возвращаем новый экземпляр класса Матрица
    }

    //вроде как вывод на экран
    // TODO переделать под красивый вывод
    @Override
    public String toString()
    {
        return "Matrix{" +
                "columnsCount=" + columnsCount +
                ", rowsCount=" + rowsCount +
                ", m=" + Arrays.deepToString(m) +
                '}';
    }
}
