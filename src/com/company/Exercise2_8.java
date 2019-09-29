package com.company;

import java.util.Scanner;

public class Exercise2_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("This is operation echo. Say something");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("continue")) {
                continue;
            } else if (input.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println(input);
                break;
            }
        }

    }
}
