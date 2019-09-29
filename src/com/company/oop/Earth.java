package com.company.oop;

public class Earth {
    public static void main(String[] args) {
        Human Tom = new Human();


        Tom.age = 5;
        Tom.eyeColor = "brown";
        Tom.heightInInches = 72;
        Tom.name = "Tom Zsabo";

        Human Sebastian = new Human();

        Sebastian.name="Sebastian";

        Tom.speak();

        Human Joe = new Human();
        Joe.name="Joe";
        Joe.age = 14;
        Joe.heightInInches = 67;
        Joe.eyeColor="green";

        System.out.println();

        Joe.speak();


    }
}
