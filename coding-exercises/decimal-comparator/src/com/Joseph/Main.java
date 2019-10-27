package com.Joseph;


// Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
//  The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places.
//  Otherwise, return false.


public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        // casting as int is done to make sure numbers after decimal point get deleted.

        if ((int) (num1 * 1000) == (int) (num2 * 1000)) {
            return true;
        }

        return false;
    }
}
