package com.joseph;

// Collections.binarySearch() method is a java.util.Collections class method that returns position of an object in a sorted list.
// Collections.binarysearch() works for objects Collections like ArrayList and LinkedList.

public class Main {

    public static void main(String[] args) {
	// write your code here
        Theatre theatre = new Theatre("Staples", 8, 12);
//        theatre.getSeats();

        if(theatre.reserveSeat("H11")) {
            System.out.println("Please Pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
    }
}
