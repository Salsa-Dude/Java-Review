package com.Joseph;

// Composition in java is the design technique to implement has-a relationship in classes.
// Java composition is achieved by using instance variables that refers to other objects. 

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dimensions dimensions = new Dimensions(20,20, 5);
        Case theCase = new Case("220mb", "Dell", "240", dimensions);

        Monitor theMonitor = new Monitor("27inch beast", "Acer", 27, new Resolution(2540, 1400));
        MotherBoard theMotherBoard = new MotherBoard("BJ-400", "Asus", 4,6, "v244");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);

        thePC.getMonitor().drawPixelAt(1500, 1200, "red");

    }
}
