package com.company;

import java.util.Scanner;

public class Exercise2_4 {
    public static void main(String[] args) {

        String [] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        System.out.println("Hey there. Please enter a number from 0 to 9, and I will spell it out for you");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println(numbers[input]);





        }
    }

