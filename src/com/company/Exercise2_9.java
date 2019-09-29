package com.company;

import java.util.Random;
import java.util.Scanner;

public class Exercise2_9 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
            System.out.println(arr[i]);

        }

        int max = arr[0];
        for (int i = 1;i<arr.length;i++){
            if (arr[i]>max) {
                max = arr[i];
            }


        }
        System.out.println("The greatest value is "+max);
    }
}

