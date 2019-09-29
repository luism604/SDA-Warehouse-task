package com.company;

import java.util.Scanner;

public class Exercise2_7 {
    public static void main(String[] args) {
        System.out.println("Hey there. Please enter a value");
        Scanner scanner = new Scanner(System.in);
        int inputNumerator = scanner.nextInt();

        System.out.println("Now enter a value by which you want to divide it");

        while (true) {
            int inputDenominator = scanner.nextInt();
            double division = (double)inputNumerator/inputDenominator;
            double roundedAnswer = Math.round(division*10000.0)/10000.0;

            if (inputDenominator == 0) {
                System.out.println("Nope. Dividing by zero is undefined");
            } else {
                System.out.println(inputNumerator + " divided by " + inputDenominator + " is " + roundedAnswer);
                System.out.println("Try entering another denominator!");

            }
        }
    }
}