package com.company.oop;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        Animal Brenna = new Animal("Brenna", 50, "Sheep Dog");
        Animal Simba = new Animal("Simba", 7, "Lion");
        Scanner scanner = new Scanner(System.in);


        System.out.println("Hi Luis. Do you want to go to the dog pen or lion pen?");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("Dog")) {
            Brenna.goesSentient();
        } else if (input.equalsIgnoreCase("Lion")) {
            Simba.eat();
        } else {
            System.out.println("Sorry, we don't have that.");
        }



    }
}
