package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        employeeTask();
        parkTask();

    }

    public static void employeeTask(){
        Employee[] employeesArray = new Employee[5];

        employeesArray[0] = new Employee("ЛюбочкинZero", "Марк", "Александрович","Учитель","teacher1@mail.ru","+375447889900","1000$",18 );
        employeesArray[1] = new Employee("ЛюбочкинOne", "Илья", "Александрович","Учитель","teacher2@mail.ru","+375447889900","1000$",18 );
        employeesArray[2] = new Employee("ЛюбочкинTwo", "Влад", "Александрович","Учитель","teacher3@mail.ru","+375447889900","1000$",18 );
        employeesArray[3] = new Employee("ЛюбочкинThree", "Саша", "Александрович","Учитель","teacher4@mail.ru","+375447889900","1000$",18 );
        employeesArray[4] = new Employee("ЛюбочкинFour", "Марк", "Александрович","Учитель","teacher5@mail.ru","+375447889900","1000$",18 );

        for (Employee employee : employeesArray) {
            employee.getInfo();
        }
    }



    public static void parkTask(){
        Park parkOne = new Park("Центральный");
        Park parkTwo = new Park("Восточный");

        parkOne.addAttraction("Качели","2$", "9:00 - 22:00");
        parkOne.addAttraction("Горки","5$", "10:00 - 22:00");
        parkOne.addAttraction("Гонки","6$", "15:00 - 22:00");

        parkTwo.addAttraction("Качели","22$", "9:00 - 22:00");
        parkTwo.addAttraction("Горки","53$", "10:00 - 22:00");
        parkTwo.addAttraction("Гонки","61$", "15:00 - 22:00");
        parkTwo.addAttraction("Колесо","100$", "15:00 - 22:00");

        parkOne.getInfo();
        parkTwo.getInfo();
    }


}

