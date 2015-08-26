package com.SourceIT.WorkWithCSV;

//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
import java.time.*;

/**
 * Created by Bogdan Kukharskiy on 24.08.2015.
 *
 * Класс отображающий строку CSV файла
 */
public class Product implements Comparable {

    private int upn;
    private String name;
    private String manufacturer;
    private double price;
    private LocalDate manunfDate;
    private LocalDate bestBeforeDate;

    public Product() {
        this.upn = 0;
        this.name = "";
        this.manufacturer = "";
        this.price = 0.0;
            //this.manunfDate = Calendar.SHORT_FORMAT(Calendar.getInstance().getTime()); //берем текущую дату
            //Calendar gc = new GregorianCalendar();
            //gc.add(Calendar.YEAR, 1);
            //this.bestBeforeDate = gc.getTime();     //берем +1 год от текущей даты
        this.manunfDate = LocalDate.now(); //берем текущую дату
        this.bestBeforeDate = LocalDate.now().plusYears(1);     //берем +1 год от текущей даты
    }
    public Product(int upn, String name, String manufacturer, double price, LocalDate manufactureDate, LocalDate bestBeforeDate) {
        this.upn = upn;
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
        this.manunfDate = manufactureDate;
        this.bestBeforeDate = bestBeforeDate;
    }

    @Override
    public int compareTo(Object o) {
        Product p = (Product) o;
        try {
            //сначала сравниваем по имени товара
            int result = name.compareTo(p.name);
            if (result != 0) {
                return result;
            }
            //затем сравниваем по UPN
            result = upn - p.upn;
            if (result != 0) {
                return (int) result / Math.abs(result);
            }
        }
        catch (ClassCastException с){
            System.out.println("Ошибка приведения класса в методе сравнения");
        }
        return 0;
    }

    @Override
    public String toString() {
        return upn +
                ";" + name  +
                ";" + manufacturer +
                ";" + price +
                ";" + manunfDate +
                ";" + bestBeforeDate;
    }
}
