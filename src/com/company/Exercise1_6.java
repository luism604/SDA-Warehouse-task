package com.company;

import java.util.Scanner;

public class Exercise1_6 {
    public static void main(String[] args) {
        float mine = 9.6f;
        byte number = 100;
        char thing = 'c';

        Scanner sc = new Scanner(System.in);
        float myFloat = sc.nextFloat();
        byte myByte = sc.nextByte();
        char myChar = sc.next().charAt(0);
    }
}
