package com.SourceIT.WorkWithCSV;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Created by Bogdan Kukharskiy on 24.08.2015.
 */
public class Runner {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(new Product());
        productList.add(new Product(111,"asaa","babab",4.4, LocalDate.now(),LocalDate.now().plusYears(1)));
        productList.add(new Product(211,"qwea","zszsz",98.123, LocalDate.now(),LocalDate.now().plusYears(1)));
        FileWriter fileWriter = new FileWriter();
        fileWriter.writeToFile("D:\\1.csv",productList);
//        fileWriter.writeToSCVRandomData("D:\\1.csv",);
    }
}
