package com.Joseph;


//
//  ArrayLists cannot hold primitive data types such as int, double, char, and long
//  (they can hold String since String is an object, and wrapper class objects (Double, Integer).


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //  Wrapper class objects
        Integer integer = new Integer(54);
        Double doubleValue = new Double(24.3);

        // Shorter way to initialize a wrapper class

        Integer myIntValue = 56; // Java is doing the Autoboxing for us - Integer.valueOf(56)
        int myInt = myIntValue; // Java is doing the Unboxing for us - myIntValue.intValue()


        // **************************************************************************

        ArrayList<Double> doubleArray = new ArrayList<Double>();

        for(double db = 0.0; db < 10.0;  db += 0.5) {
            // Autoboxing
//            doubleArray.add(Double.valueOf(db));
            doubleArray.add(db);
        }

        for(int i = 0; i < doubleArray.size(); i++ ) {
            // Unboxing
//            double value = doubleArray.get(i).doubleValue();
            double value = doubleArray.get(i);
            System.out.println(i + " => " + value);
        }



        ArrayList<Integer> myIntArray = new ArrayList<Integer>();

        for(int i = 0; i <= 10; i++) {
            // AutoBoxing
            // - this is where we are creating or converting a base primitive type int to an wrapper class
            myIntArray.add(Integer.valueOf(i));
        }

        for (int i= 0; i <= 10; i++) {
            // Unboxing
            // - is where we are taking if from the object wrapper class and converting it back to a primitive type
            System.out.println(i + " => " + myIntArray.get(i).intValue());
        }
    }
}
