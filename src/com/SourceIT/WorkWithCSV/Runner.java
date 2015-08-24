package com.SourceIT.WorkWithCSV;

import java.util.ArrayList;

/**
 * Created by Bogdan Kukharskiy on 24.08.2015.
 */
public class Runner {
    public static void main(String[] args) {
//        Product product = new Product();
        ArrayList<Product> productList = new ArrayList<Product>();
        productList.add(new Product());
//        productList.add(new Product(111,"asaa","babab",4.4,));
        FileWriter fileWriter = new FileWriter();
        fileWriter.writeToFile("D:\\1.csv",productList);
//        fileWriter.writeToSCVRandomData("D:\\1.csv",);
    }
}
