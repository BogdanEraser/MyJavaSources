package com.SourceIT.MyJavaSources.src.com.SourceIT.Lesson_04;

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
    private int rowCount;
    private float[][] m;

    public int getColumnsCount()
    {
        return columnsCount;
    }

    public int getRowCount()
    {
        return rowCount;
    }

    //конструктор
    public Matrix(int columnsCount, int rowCount, float[][] m)
    {
        this.columnsCount = columnsCount;
        this.rowCount = rowCount;
        this.m = new float[columnsCount][rowCount];
    }



}
