package org.example;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Lesson1.printThreeWords();
        Lesson1.checkSumSign();
        Lesson1.printColor();
        Lesson1.compareNumbers();
        System.out.println(Lesson1.checkNumber(10, 2));
        Lesson1.positiveNumber(0);
        System.out.println(Lesson1.checkPositiveNumber(0));
        Lesson1.countString("Dota 2", 5);
        System.out.println(Lesson1.leapYear(400));
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        Lesson1.invertArray(arr);
        Lesson1.fillArray();
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        Lesson1.multiplyArray(arr2);
        Lesson1.fillDiagonal();
        Lesson1.createArray(5, 3);


    }
}