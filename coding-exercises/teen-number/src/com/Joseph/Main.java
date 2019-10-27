package com.Joseph;


// We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
// Write a method named hasTeen with 3 parameters of type int.
// The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static boolean hasTeen(int person1, int person2, int person3) {
        if(person1 >= 13 && person1 <= 19 || person2 >= 13 && person2 <= 19 || person3 >= 13 && person3 <= 19 ) {
            return true;
        }

        return false;

    }

//    Write another method named isTeen with 1 parameter of type int.
//    The method should return boolean and it needs to return true if the parameter is in range 13(inclusive) - 19 (inclusive).
//    Otherwise return false.

    public static boolean isTeen(int person) {
        if(person >= 13 && person <= 19) {
            return true;
        }

        return false;
    }

}
