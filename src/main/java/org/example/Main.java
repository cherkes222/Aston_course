package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1,2");
        System.out.println("--------------------");

        Product[] productsArray = new Product[5];

        productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025", "Samsung Corp.", "Korea", 5599, true);
        productsArray[1] = new Product("iPhone 15 Pro Max", "12.09.2025", "Apple", "USA", 1200, false);
        productsArray[2] = new Product("Sony WH-1000XM5", "10.10.2024", "Sony", "Japan", 350, true);
        productsArray[3] = new Product("MacBook Pro 14", "20.08.2023", "Apple", "USA", 2200, false);
        productsArray[4] = new Product("LG OLED TV", "05.06.2022", "LG", "South Korea", 1500, true);

        for (Product product : productsArray) {
            product.printInfo();
        }

        System.out.println("Задание 3");
        System.out.println("--------------------");

        Park myPark = new Park("Диснейленд", "Волшебная улица, 1", 3);

        myPark.addAttraction("Американские горки", "10:00 - 22:00", 500);
        myPark.addAttraction("Колесо обозрения", "11:00 - 20:00", 350);
        myPark.addAttraction("Поездка на лодке", "09:00 - 18:00", 200);

        myPark.printParkInfo();
    }
}