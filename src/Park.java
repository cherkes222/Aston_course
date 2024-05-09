package org.example;

import java.util.ArrayList;
import java.util.List;

public class Park {
    final String namePark;
    List<Attraction> attractions = new ArrayList<>();

    public Park( String namePark){
        this.namePark = namePark;
    }

    class Attraction{
        private final String nameAttraction;
        private final String price;
        private final String workingHours;

        public Attraction(String nameAttraction, String price, String workingHours){
            this.nameAttraction = nameAttraction;
            this.price = price;
            this.workingHours = workingHours;
        }
    }

    void addAttraction(String nameAttraction, String price, String workingHours){
        attractions.add(new Attraction(nameAttraction, price, workingHours));
    }


    void getInfo(){
        System.out.println("Название парка: " + namePark);
        System.out.println("Колличество аттракционов: " + attractions.size());
        getInfoByAttraction();
    }

    private void getInfoByAttraction(){
        for (Attraction it : attractions){
            System.out.println("Название аттракциона : " + it.nameAttraction);
            System.out.println("Стоимость : " + it.price);
            System.out.println("Время работы : " + it.workingHours);
            System.out.println("----------------");
        }
    }

}

