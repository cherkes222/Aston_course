package org.example;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(10, "Синий", "Зелёный");
        Shape rectangle = new Rectangle(5, 8, "Фиолетовый", "Жёлтый");
        Shape triangle = new Triangle(6, 8, 10, "Оранжевый", "Коричневый");

        circle.printInfo();
        System.out.println();
        rectangle.printInfo();
        System.out.println();
        triangle.printInfo();
    }
}