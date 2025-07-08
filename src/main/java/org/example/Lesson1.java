package org.example;

public class Lesson1 {

    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public static void checkSumSign(int a, int b){
        int c = a + b;
        if (c > 0){
            System.out.println("Число положительное.");
        }
        else {
            System.out.println("Число отрицательное.");
        }
    }

    public static void printColor(int value){
        if (value <= 0) {
            System.out.println("Красный");
        }
        else if (value > 0 && value <= 100){
            System.out.println("Жёлтый");
        }
        else{
            System.out.println("Зелёный");
        }
    }


    public static void compareNumbers(int a, int b){
        if (a > b){
            System.out.println("a > b");
        }
        else {
            System.out.println("a < b");
        }
    }


    public static boolean checkNumber(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


    public static void positiveNumber(int a){
        if (a >= 0){
            System.out.println("Число положительное");
        }
        else{
            System.out.println("Число отрицательное");
        }
    }


    public static boolean checkPositiveNumber(int a){
        return a >= 0;
    }


    public static void countString(String a, int b){
        for (int i = 0; i < b; i++){
            System.out.println(a);
        }

    }

    public static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

    }

    public static void invertArray(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else { arr[i] = 0;

            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillArray(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }
        System.out.println(" ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void multiplyArray(int[] arr2){
        for (int i = 0; i < arr2.length; i++){
            if (arr2[i] < 6){
                arr2[i] = arr2[i] * 2;
            }
        }
        System.out.println(" ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

    public static void fillDiagonal() {
        int n = 3;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            arr[i][i] = 1;
        }
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        return arr;
    }
}
