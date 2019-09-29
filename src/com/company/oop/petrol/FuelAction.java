package com.company.oop.petrol;

import java.util.Scanner;

public class FuelAction {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String command;
            FuelPump fuelPump = new FuelPump();

            System.out.println("Welcome to our Gas Station");

            do {

                System.out.print("Please tell to us. What do you want to do? \n Continue - To get fuel \n Finish - To end the refueling \n : ");
                command = scanner.next();

                if (command.equalsIgnoreCase("Continue")) {
                    fuelPump.refuel();
                    System.out.println("You got a fuel refueling of " + fuelPump.getGasIncrement() + " L");
                    System.out.println("We charged you a " + fuelPump.charge() + " EUR to your bill");
                } else {
                    System.out.println("You got a " + fuelPump.getGas() + " l refuel and you must pay " + fuelPump.getAmount() + " EUR invoice");
                }

            } while (!command.equalsIgnoreCase("Finish"));

            float toPay;

            do {
                System.out.print("Please enter your money [" + fuelPump.debt() + " EUR] to complete your payment: ");
                float money = scanner.nextFloat();
                toPay = fuelPump.pay(money);

                if (toPay < 0) {
                    System.out.println("Please, take your cashback of " + -toPay + " EUR");
                }

            } while (toPay > 0);

        }

    }
