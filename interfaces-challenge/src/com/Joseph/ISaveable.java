package com.Joseph;

// Create a simple interface (tip: name it Saveable or ISaveable)
// That interface allows an object to be saved to some sort of storage medium. (tip: use arraylist)
// The exact type of medium is not known to the interface (nor to the classes that implement it).
// The interface will just specify two methods, one to return an ArrayList of values to be saved
// and the other to populate the object's fields from an ArrayList (parameter).

import java.util.List;

//An interface is a way of grouping classes.The reason for this is that any class that implements that interface must "do" all the methods that are written in that interface.  So if there is an interface called "animal" which has methods: eat, sleep, walk, run, jump, then we have a bunch of classes for different types of animals, we would "group" all the different animal classes together by making them all implement the interface which means they must all "do" the methods in the interface, because those methods are common to them all.  If that sounds exactly like inheritance with an abstract parent class that's because it is.  The reason that interfaces are sometimes used instead of regular abstract class inheritance is because in Java a class can only have one parent class but can have man interfaces.  If a class could have multiple parent classes then there would be little point in interfaces.  The interface also "guarantees" how to communicate with the class, so that there is set standard that all the classes must follow to make everything straightforward and streamlined.






        import java.util.ArrayList;
import java.util.List;

public interface ISaveable {

    List<String> write();
    void read(List<String> savedValues);

}
