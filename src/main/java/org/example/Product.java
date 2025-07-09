package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {

    private String name;
    private LocalDate productionDate;
    private String manufacturer;
    private String countryOfOrigin;
    private double price;
    private boolean isBooked;


    public Product(String name, String productionDate, String manufacturer, String countryOfOrigin, double price, boolean isBooked) {
        this.name = name;
        this.productionDate = LocalDate.parse(productionDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isBooked = isBooked;
    }


    public void printInfo() {
        System.out.println("Название товара: " + name);
        System.out.println("Дата производства: " + productionDate);
        System.out.println("Производитель: " + manufacturer);
        System.out.println("Страна происхождения: " + countryOfOrigin);
        System.out.println("Цена: " + price + " руб.");
        System.out.println("Состояние бронирования: " + (isBooked ? "Забронирован" : "Не забронирован"));
        System.out.println(" ");
    }


}
