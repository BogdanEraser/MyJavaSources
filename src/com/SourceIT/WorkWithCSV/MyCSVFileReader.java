package com.SourceIT.WorkWithCSV;

import java.io.Closeable;
import java.io.IOException;
import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Bogdan Kukharskiy on 01.09.2015.
 */
public class MyCSVFileReader implements CSVReader {

    private static void closeStream(Closeable stream) {
        if (stream != null) {
            try {
                stream.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия потока");
            }
        }
    }

    @Override
    public List<Product> readFromFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Нет доступа к файлу " + fileName);
        }
        List<Product> productList = null;

        Scanner readData = null;
        try {
            readData = new Scanner(file).useDelimiter("[\\r\\n;]+").useLocale(Locale.ENGLISH);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения из файла " + fileName);
        }
        String nextData = null;
        int upn;
        String name;
        String manufacturer;
        double price;
        LocalDate manufactureDate;
        LocalDate bestBeforeDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-mm-dd");
        try {
            while (readData.hasNext()) {
                upn = Integer.parseInt(readData.next());
                name = readData.next();
                manufacturer = readData.next();
                price = Double.parseDouble(readData.next());
                manufactureDate = LocalDate.parse(readData.next(),formatter);
                bestBeforeDate = LocalDate.parse(readData.next(),formatter);
                productList.add(new Product(upn, name, manufacturer, price, manufactureDate, bestBeforeDate));
            }
        } catch (ClassCastException c) {
            System.out.println("Ошибка приведения класса при чтении файла" + c.toString());
        }
        readData.close();

        return productList;
    }
}
