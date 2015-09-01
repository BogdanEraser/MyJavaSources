package com.SourceIT.WorkWithCSV;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Bogdan Kukharskiy on 24.08.2015.
 */
public class Runner {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(new Product());
        productList.add(new Product(111,"asaa","babab",4.4, LocalDate.now(),LocalDate.now().plusYears(1)));
        productList.add(new Product(211, "qwea", "zszsz", 98.123, LocalDate.now(), LocalDate.now().plusYears(1)));

        MyCSVFileWriter fileWriter = new MyCSVFileWriter();
        fileWriter.writeProductListToCSV("D:\\1.csv", productList, true);

        MyCSVFileReader fileReader = new MyCSVFileReader();

        fileReader.readFromFile("D:\\1.csv").toString();
    }
}
