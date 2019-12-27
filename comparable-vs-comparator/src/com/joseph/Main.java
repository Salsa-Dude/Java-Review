package com.joseph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

        List<Laptop> laps = new ArrayList<Laptop>();
        laps.add(new Laptop("Dell", 16, 800));
        laps.add(new Laptop("Apple", 8, 1200));
        laps.add(new Laptop("Acer", 12, 700));

        // Using Comparable
        Collections.sort(laps);

        // Using Comparator
        Comparator<Laptop> comp = new Comparator<Laptop>() {

            public int compare(Laptop one, Laptop two) {
                if(one.getPrice() > two.getPrice()) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        // using Comparator
        Collections.sort(laps, comp);

        for(Laptop lap : laps) {
            System.out.println(lap);
        }


    }
}
