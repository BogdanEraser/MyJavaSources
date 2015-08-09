package com.SourceIT.Lesson_04;

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
public class Matrix {
    private int columnsCount;
    private int rowsCount;
    private float[][] m;

    public int getColumnsCount() {
        return this.columnsCount;
    }

    public int getRowsCount() {
        return this.rowsCount;
    }

    public float getElement(int i, int j) {
        return this.m[i][j];
    }

    public void setElement(int i, int j, float value) {
        this.m[i][j] = value;
    }

    //конструктор
    public Matrix(int columnsCount, int rowsCount, float[][] m) {
        this.columnsCount = columnsCount;
        this.rowsCount = rowsCount;
        this.m = m;
    }

    //сложение матриц
    public Matrix addMatrix(Matrix a, Matrix b) {
        if ((a.getColumnsCount() != b.getColumnsCount()) || (a.getRowsCount() != b.getRowsCount())) {
            System.out.println("Матрицы не равны по строками и/или столбцам. Сложение невозможно");
            return null;
        }
        float c[][] = new float[a.getColumnsCount()][a.getRowsCount()];
        for (int i = 0; i < a.getColumnsCount(); i++)
            for (int j = 0; j < a.getRowsCount(); j++) {
                c[i][j] = a.getElement(i, j) + b.getElement(i, j);
            }
        return new Matrix(a.getColumnsCount(), a.getRowsCount(), c);    //возвращаем новый экземпляр класса Матрица
    }

    //умножение на число
    public void multiplyOnNumber(int n) {
        for (int i = 0; i < this.getColumnsCount(); i++)
            for (int j = 0; j < this.getRowsCount(); j++) {
                this.setElement(i, j, this.getElement(i, j) * n);
            }
    }

    //умножение на другую матрицу
    public Matrix multiplyOnMatrix(Matrix b) {
        if ((this.getColumnsCount() != b.getRowsCount())) {
            System.out.println("Матрицы не годятся для перемножения." +
                    " Число столбцов первого сомножителя не равно числу строк второго сомножителя");
            return null;
        }
        float c[][] = new float[b.getColumnsCount()][this.getRowsCount()];
        for (int i = 0; i < this.getRowsCount(); i++) {
            for (int j = 0; j < b.getColumnsCount(); j++) {
                c[j][i] = 0;
                for (int k = 0; k < b.getRowsCount(); k++) {
                    c[j][i] = c[j][i] + this.getElement(k, i) * b.getElement(j, k);
                }
            }
        }
        return new Matrix(b.getColumnsCount(), this.getRowsCount(), c);    //возвращаем новый экземпляр класса Матрица
    }

    //транспонирование матрицы
    public Matrix transposition() {
        float[][] t = new float[this.getRowsCount()][this.getColumnsCount()];
        for (int i = 0; i < this.getRowsCount(); i++) {
            for (int j = 0; j < this.getColumnsCount(); j++) {
                t[i][j]= this.getElement(j, i);
            }
        }
        return new Matrix(this.getRowsCount(), this.getColumnsCount(), t);    //возвращаем новый экземпляр класса Матрица
    }

    //вроде как вывод на экран
    // TODO переделать под красивый вывод
    @Override
    public String toString() {
        return "Matrix{" +
                "columnsCount=" + columnsCount +
                ", rowsCount=" + rowsCount +
                ", m=" + Arrays.deepToString(m) +
                '}';
    }

    public void coolOutput()
    {
        for (int i = 0; i<this.getRowsCount(); i++) {
            for (int j = 0; j <this.getColumnsCount(); j++) {
                System.out.print(this.getElement(j, i) + "  ");
            }
            System.out.println();
        }
    }
}
