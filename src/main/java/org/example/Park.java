package org.example;

public class Park {
    private String name;  // Название парка
    private String address;  // Адрес парка
    private Attraction[] attractions;  // Массив аттракционов
    private int attractionCount;  // Количество аттракционов в парке

    // Конструктор класса Park
    public Park(String name, String address, int maxAttractions) {
        this.name = name;
        this.address = address;
        this.attractions = new Attraction[maxAttractions];
        this.attractionCount = 0;
    }

    // Метод для добавления аттракциона в парк
    public void addAttraction(String name, String workingHours, double price) {
        if (attractionCount < attractions.length) {
            attractions[attractionCount++] = new Attraction(name, workingHours, price);
        } else {
            System.out.println("Нет места для новых аттракционов!");
        }
    }

    // Метод для вывода информации о парке и его аттракционах
    public void printParkInfo() {
        System.out.println("Парк: " + name);
        System.out.println("Адрес: " + address);
        System.out.println("Список аттракционов:");
        for (int i = 0; i < attractionCount; i++) {
            attractions[i].printAttractionInfo();
        }
    }

    // Внутренний класс Attraction
    private class Attraction {
        private String name;  // Название аттракциона
        private String workingHours;  // Время работы аттракциона
        private double price;  // Стоимость аттракциона

        // Конструктор для аттракциона
        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        // Метод для вывода информации о аттракционе
        public void printAttractionInfo() {
            System.out.println("Название: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println(" ");
        }
    }
}
