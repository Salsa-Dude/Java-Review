package com.joseph;

// Collections.binarySearch() method is a java.util.Collections class method that returns position of an object in a sorted list.
// Collections.binarysearch() works for objects Collections like ArrayList and LinkedList.

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Theatre theatre = new Theatre("Staples", 8, 12);

//        A shallow copy is a copy of the reference pointer to the object
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
        printList(seatCopy);

        // Collection Methods
        // - reverse method
        Collections.reverse(seatCopy);
        printList(seatCopy);

        // - shuffle method
        Collections.shuffle(seatCopy);
        printList(seatCopy);

        // - min method
        Theatre.Seat minSeat = Collections.min(seatCopy);

        // max method
        Theatre.Seat maxSeat = Collections.max(seatCopy);

        // Both min and max work for both sorted and unsorted list

        System.out.println("min seat number is " + minSeat.getSeatNumber());
        System.out.println("max seat number is " + maxSeat.getSeatNumber());

        // - swap method




        //theatre.getSeats();

//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }

//        if(theatre.reserveSeat("H11")) {
//            System.out.println("Please Pay");
//        } else {
//            System.out.println("Sorry, seat is taken");
//        }
    }

    public static void printList(List<Theatre.Seat> list) {
        for(Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("===============================================================================");
    }



}
