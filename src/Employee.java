package org.example;

public class Employee {
    private final String firstName;
    private final String middleName;
    private final String lastName;
    private final String position;
    private final String email;
    private final String numberPhone;
    private final String salary;
    private final Integer age;

    public Employee(String lastName, String firstName, String middleName, String position, String email, String numberPhone, String salary, Integer age){
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.numberPhone = numberPhone;
        this.salary = salary;
        this.age = age;
    }


    protected void getInfo (){
        System.out.println("ФИО : " + lastName + " " + firstName + " " + middleName);
        System.out.println("Должность : " + position);
        System.out.println("Email : " + email);
        System.out.println("Телефон : " + numberPhone);
        System.out.println("Зарплата : " + salary);
        System.out.println("Возраст : " + age);
        System.out.println("----------------");
    }



}
