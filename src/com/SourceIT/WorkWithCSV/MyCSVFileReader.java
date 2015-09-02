package com.SourceIT.WorkWithCSV;

import java.io.Closeable;
import java.io.IOException;
import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by Bogdan Kukharskiy on 01.09.2015.
 */
public class MyCSVFileReader implements CSVReader {

//    private static void closeStream(Closeable stream) {
//        if (stream != null) {
//            try {
//                stream.close();
//            } catch (IOException e) {
//                System.out.println("Ошибка закрытия потока");
//            }
//        }
//    }

    @Override
    public List<Product> readFromFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Нет доступа к файлу " + fileName);
        }
        List<Product> productList = null;

        Scanner readData = null;
        try {
            readData = new Scanner(file).useDelimiter("[\\r\\n;]+");
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка чтения из файла " + fileName);
        }
        int upn;
        String name;
        String manufacturer;
        BigDecimal price;
        LocalDate manufactureDate;
        LocalDate bestBeforeDate;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            while (readData.hasNext()) {
                upn = Integer.parseInt(readData.next());
                name = readData.next();
                manufacturer = readData.next();
                price = BigDecimal.valueOf(Double.parseDouble(readData.next()));
                manufactureDate = LocalDate.parse(readData.next(),formatter);
                bestBeforeDate = LocalDate.parse(readData.next(),formatter);
                productList.add(new Product(upn, name, manufacturer, price, manufactureDate, bestBeforeDate));
            }
        } catch (ClassCastException c) {
            System.out.println("Ошибка приведения класса при чтении файла." + c.toString());
        } catch (NullPointerException n) {
            System.out.println("Какая-то ошибка ." + n.toString());
        }
        readData.close();

        return productList;
    }
}
