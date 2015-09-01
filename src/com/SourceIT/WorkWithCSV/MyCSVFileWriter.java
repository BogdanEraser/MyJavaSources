package com.SourceIT.WorkWithCSV;

import java.io.*;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Bogdan Kukharskiy on 24.08.2015.
 */
public class MyCSVFileWriter implements CSVWriter {

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
    public void writeProductListToCSV(String destinationFileName, List<Product> newData, boolean appendToFile) {
        File file = new File(destinationFileName);
        PrintWriter out = null;

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Ошибка создания файла " + destinationFileName);
            }
        }


        try {
            if (appendToFile) {
                out = new PrintWriter(new FileOutputStream(file, true));// робимо append до файлу
            } else {
                out = new PrintWriter(file);
            }

            Iterator<Product> productIterator = newData.iterator();
            while (productIterator.hasNext()) {
                out.println(productIterator.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка записи в файл " + destinationFileName);
        } finally {
            closeStream(out);
        }
    }


    @Override
    public void writeToCSVRandomData(String destinationFileName, int lineValue) {
        File file = new File(destinationFileName);
        PrintWriter out = null;

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("Ошибка создания файла " + destinationFileName);
            }
        }

        try {
            out = new PrintWriter(file);
            int i = 0;
            while (i < lineValue) {
                out.println(new Product());
                i++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка записи в файл " + destinationFileName);
        } finally {
            closeStream(out);
        }
    }
}
