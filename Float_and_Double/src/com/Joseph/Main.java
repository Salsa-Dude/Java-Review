package com.Joseph;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Int numbers won't return any remainders
        // width of int =  32 (4 bytes)
        int myIntValue = 5 / 3;

        // Float numbers return 7 decimal digits of precision
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;

        // Double numbers return 16 digits of precision
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("My Int value = " + myIntValue);
        System.out.println("My Float value = " + myFloatValue);
        System.out.println("My Double value = " + myDoubleValue);


    }
}
