package com.SourceIT.WorkWithCSV;

import java.io.*;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Bogdan Kukharskiy on 24.08.2015.
 */
public class FileWriter implements CSVWriter {

    public void writeToFile(String destinationFileName, List<Product> newData) {
        File file = new File(destinationFileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Ошибка создания файла " + destinationFileName);
            }
        }
        PrintWriter out = null;
        try {
            out = new PrintWriter(file);
            Iterator<Product> productIterator = newData.iterator();
            while (productIterator.hasNext()) {
                out.print(productIterator.toString());
                productIterator.next();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка записи в файл " + destinationFileName);
        } finally {
            closeStream(out);
        }
    }

    private static void closeStream(Closeable stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия потока");
                //LOGGER.error(String.format("Can't close %s", stream));
            }
        }
    }


    @Override
    public void writeProductListToSCV(String destinationFileName, List<Product> newData, boolean appendToFile) {

    }

    @Override
    public void writeToSCVRandomData(String destinationFileName, int lineValue) {
        File file = new File(destinationFileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Ошибка создания файла " + destinationFileName);
            }
        }
        PrintWriter out = null;
        try {
            out = new PrintWriter(file);
            out.print(lineValue);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка записи в файл " + destinationFileName);
        } finally {
            closeStream(out);
        }

    }
}
