package com.SourceIT.WorkWithCSV;

import java.util.List;

/**
 * Created by Bogdan Kukharskiy on 24.08.2015.
 */
public interface CSVWriter {
    void writeProductListToSCV(String destinationFileName, List<Product> newData, boolean appendToFile);
    void writeToSCVRandomData(String destinationFileName,  int lineValue);
}
