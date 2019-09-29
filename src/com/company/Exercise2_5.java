package com.company;

import java.util.Scanner;

public class Exercise2_5 {
    public static void main(String[] args) {
//Christmas Tree
        for (int x = 1; x <= 6; x++) {
            for (int y = 1; y <= (6 - x); y++) {
                System.out.print(" ");
            }
            for (int z = 0; z < x + (x - 1); z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
//Triangle
        for (int x = 1; x <= 5; x++) {
            for (int y = 0; y < x; y++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
//Rectangle
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey. Please enter the row size");
        int rows = scanner.nextInt();

        System.out.println("Please enter the column size");
        int columns = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || i == columns - 1 || j == 0 || j == columns - 1 || i == j || i == (columns - j - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}


