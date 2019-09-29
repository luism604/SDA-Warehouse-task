package com.company;

import java.util.Scanner;

public class Exercise2_2 {
    public static void main(String[] args) {
        System.out.println("Hey there. Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();

        System.out.println("Now please enter a second number");
        int inputTwo = scanner.nextInt();

        System.out.println("Now enter a number to which you want to compare it");
        int border = scanner.nextInt();

        if (inputOne > border || inputTwo > border ) {
            System.out.println("One of the values provided is greater than "+border);
        } else if (inputOne < border || inputTwo > border) {
            System.out.println("One of the values provided is less than "+border);
        } else if (inputOne == border || inputTwo == border) {
            System.out.println("One of the values provided is equal to "+border);
        }
    }
}
