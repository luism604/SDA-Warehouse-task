package com.company;

import java.util.Scanner;

public class Exercise2_6 {
    public static void main(String[] args) {
        System.out.println("You are at the cashier. Would you like to buy milk or wine?");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if (input.equalsIgnoreCase("milk")) {
            System.out.println("Okay, that will cost 1.50 euro. How much do you have?");
            double milk = sc.nextDouble();
            if (milk >= 1.50) {
                System.out.println("Thanks! Have a good day.");
            } else {
                System.out.println("Sorry. That's not enough!");
            }

        } else if (input.equalsIgnoreCase("wine")) {
            System.out.println("Woah there cowboy. Are you over 18?");
            String age = sc.nextLine();
            if (age.equalsIgnoreCase("yes")) {
                System.out.println("All right then. That'll be 12.50. How much do you have?");
                double winePrice = sc.nextDouble();
                if (winePrice >= 12.50) {
                    System.out.println("Thanks. Don't go too crazy!");
                } else {
                    System.out.println("Sorry, not enough");
                }
            } else {
                System.out.println("Get out of here.");
            }

        } else {
            System.out.println("Sorry buddy. Not that kind of store");
        }
    }
}
