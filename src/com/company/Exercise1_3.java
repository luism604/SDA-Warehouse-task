package com.company;

import java.util.Arrays;

public class Exercise1_3 {

    public static void main(String[] args) {

        int blockSize = 15;
        char padCharacter = ' ';
        String [] examples = {"Car", "Milk", "House"};


        for (String value: examples) {
            StringBuilder builder = new StringBuilder(value);

            while (builder.length()<blockSize) {
                builder.insert(0, padCharacter);
            }
            System.out.println(builder.toString());
        }


    }
}
