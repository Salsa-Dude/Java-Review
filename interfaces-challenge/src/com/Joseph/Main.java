package com.Joseph;


//An interface is a way of grouping classes.
// The reason for this is that any class that implements that interface must "do" all the methods that are written in that interface.
// So if there is an interface called "animal" which has methods: eat, sleep, walk, run, jump, then we have a bunch of classes for different types of animals, we would "group" all the different animal classes together by making them all implement the interface which means they must all "do" the methods in the interface, because those methods are common to them all.
// If that sounds exactly like inheritance with an abstract parent class that's because it is.
// The reason that interfaces are sometimes used instead of regular abstract class inheritance is because in Java a class can only have one parent class but can have man interfaces.
// If a class could have multiple parent classes then there would be little point in interfaces.
// The interface also "guarantees" how to communicate with the class, so that there is set standard that all the classes must follow to make everything straightforward and streamlined.

// Create a simple interface (tip: name it Saveable or ISaveable)
// That interface allows an object to be saved to some sort of storage medium. (tip: use arraylist)
// The exact type of medium is not known to the interface (nor to the classes that implement it).
// The interface will just specify two methods, one to return an ArrayList of values to be saved
// and the other to populate the object's fields from an ArrayList (parameter).
//
// Create a few sample classes that implement your Saveable interface (we've used the idea of a game,
// with Players and Monsters, but you can create any type of classes that you want).
//
// Override the toString() method for each of your classes so that they can be easily printed to enable
// the program to be tested easier.
//
// In Main, write a method that takes an object that implements the interface as a parameter and
// "saves" the values e.g. calls the method defined in the interface.

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Player joseph = new Player("joseph", 10, 15);
        System.out.println(joseph.toString());
        saveObject(joseph);

        joseph.setHitPoints(8);
        System.out.println(joseph);
        joseph.setWeapon("Hands");

        saveObject(joseph);
        loadObject(joseph);

        saveObject(joseph);

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveable objectToSave) {
        for(int i = 0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");;
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
