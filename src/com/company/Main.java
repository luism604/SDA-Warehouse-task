package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Please enter a double");
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();

        System.out.println("How many decimals places would you like? Please enter something below 15");
        long placesInput = scanner.nextLong();


        double rounded = roundWithDecimalPlaces(value, placesInput);
        System.out.println(rounded);

    }

    public static double roundWithDecimalPlaces(Double value, long places) {

        long factor = (long) Math.pow(10, places);
        return Math.round(value * factor) / (double) factor;

          // int factor = 1000;
           //return Math.round(value*factor) / (double)factor;

    }

}
