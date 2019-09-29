package com.company;

import java.util.Scanner;

public class Exercise1_4 {
    public static void main(String[] args) {
        System.out.println("Hi. Please enter the first value");
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();

        System.out.println("Thanks. Now enter the second value");
        int inputTwo = scanner.nextInt();

        double division = (double) inputOne / inputTwo;

        double roundedResult = roundWithDecimalPlaces(division, 3);

        if (inputTwo == 0) {
            System.out.println("This is undefined");
        } else {
            System.out.println("The result is : " + roundedResult);
        }

    }

    public static double roundWithDecimalPlaces(Double value, long places) {

        long factor = (long) Math.pow(10, places);
        return Math.round(value * factor) / (double) factor;
    }

}