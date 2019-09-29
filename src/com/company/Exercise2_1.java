package com.company;

import java.util.Scanner;

public class Exercise2_1 {
    public static void main(String[] args) {
        System.out.println("Hey there. Please enter a number");
        Scanner scanner = new Scanner(System.in);
        int inputOne = scanner.nextInt();

        System.out.println("Now please enter a second number");
        int inputTwo = scanner.nextInt();

        System.out.println("Now enter a number to which you want to compare it");
        int border = scanner.nextInt();

        if (inputOne > border && inputTwo > border ) {
            System.out.println("Both numbers  greater than "+border);
        } else if (inputOne > border && inputTwo < border) {
            System.out.println("The first number is bigger than "+border+", but the second number is smaller");
        } else if (inputOne > border && inputTwo == border){
            System.out.println("The first number is great than"+border+". The second number is equal");
        } else if (inputOne == border && inputTwo > border) {
            System.out.println("The first number is equal to "+border+", but the second number is greater");
        } else if (inputOne == border && inputTwo == border) {
            System.out.println("Both are equal to "+border);
        } else if (inputOne == border && inputTwo < border){
            System.out.println("The first number is equal to "+border+", but the second number is smaller");
        } else if (inputOne < border && inputTwo > border) {
            System.out.println("The first number is less than "+border+", but the second number is greater");
        } else if (inputOne < border && inputTwo == border) {
            System.out.println("The first number is less than "+border+", but the second number is equal ");
        } else {
            System.out.println("Bot the numbers are less than "+border);
        }
    }
}
