package com.company.oop;

public class Animal {
    String name;
    int weightInLbs;
    String species;

    public Animal (String name, int weightInLbs, String species) {
        this.name = name;
        this.weightInLbs = weightInLbs;
        this.species = species;

    }

    public void eat (){
        System.out.println("Yum yum");
    }

    public void sleep () {
        System.out.println("ZzZzZzZz");
    }

    public void goesSentient () {
        System.out.println("My name is "+name+". I weigh "+weightInLbs+" pounds, and I'm a "+species+". Rargh!!");
    }


}


