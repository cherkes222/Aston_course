package org.example;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Product {
    // Поля класса
    private String name; // Название товара
    private LocalDate productionDate; // Дата производства
    private String manufacturer; // Производитель
    private String countryOfOrigin; // Страна происхождения
    private double price; // Цена товара
    private boolean isBooked; // Состояние бронирования (покупателем)

    // Конструктор класса
    public Product(String name, String productionDate, String manufacturer, String countryOfOrigin, double price, boolean isBooked) {
        this.name = name;
        this.productionDate = LocalDate.parse(productionDate, DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.manufacturer = manufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.price = price;
        this.isBooked = isBooked;
    }

    // Метод для вывода информации о товаре
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
