package com.company.coding_review;

import java.util.*;

public class exampleReview {
    public static void main(String[] args) {
        List<String> sda = new ArrayList<>();
        sda.add("Alex");
        sda.add("Luis");
        sda.add("Kerli");
        sda.add("Axel");

        System.out.println(sda.size());

        sda.remove(1);


        int count = 0;
        for(String name : sda) {
            if (name.startsWith("A"))
                ++count;

            System.out.println(count);

        }

        Collections.reverse(sda);
        System.out.println(sda);

        Map<Integer,String> nameMap = new HashMap<>();

        nameMap.put(1, "Luis");
        nameMap.put(2, "Aleks");

        nameMap.keySet();

        System.out.println();


    }
}

