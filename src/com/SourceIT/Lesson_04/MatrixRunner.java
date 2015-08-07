package com.SourceIT.MyJavaSources.src.com.SourceIT.Lesson_04;

/**
 * Created by Bogdan Kukharskiy on 07.08.15.
 */
public class MatrixRunner
{
    public static void main(String[] args)
    {
        float[][] masA = {{2f, 4f}, {6f, 8f}};
        Matrix a = new Matrix(2,2,masA);
        float[][] masB = {{3f, 5f}, {7f, 9f}};
        Matrix b = new Matrix(2,2,masB);

        System.out.println(a);
        System.out.println(b);
    }
}
