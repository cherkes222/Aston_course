package org.example;

public class Park {
    private String name;
    private String address;
    private Attraction[] attractions;
    private int attractionCount;

    public Park(String name, String address, int maxAttractions) {
        this.name = name;
        this.address = address;
        this.attractions = new Attraction[maxAttractions];
        this.attractionCount = 0;
    }

    public void addAttraction(String name, String workingHours, double price) {
        if (attractionCount < attractions.length) {
            attractions[attractionCount++] = new Attraction(name, workingHours, price);
        } else {
            System.out.println("Нет места для новых аттракционов!");
        }
    }

    public void printParkInfo() {
        System.out.println("Парк: " + name);
        System.out.println("Адрес: " + address);
        System.out.println("Список аттракционов: " + attractionCount);
        System.out.println(" ");
        for (int i = 0; i < attractionCount; i++) {
            attractions[i].printAttractionInfo();
        }
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private double price;

        public Attraction(String name, String workingHours, double price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printAttractionInfo() {
            System.out.println("Название: " + name);
            System.out.println("Время работы: " + workingHours);
            System.out.println("Стоимость: " + price + " руб.");
            System.out.println(" ");
        }
    }
}
