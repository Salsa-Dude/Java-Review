package com.Joseph;


// Value types
// - When we create a value type variable, a single space in memory is allocated to store the value
// and that variable directly holds the value
// - When we assign it to another variable the value is copied but both variable work independently.
// each have their own copy of a specfic value

// Reference types
// - arrays are reference types
// - a reference holds a reference or an address to the object but not the object itself.
//   (holds the object address in memory)
// - reference types represent the address of the variable rather than the data itself


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int myIntValue = 10;
        int myAnotherIntValue = myIntValue;

        System.out.println("My int value is " + myIntValue);
        System.out.println("My other int value is " + myAnotherIntValue);

        myAnotherIntValue++;

        System.out.println("My int value is " + myIntValue);
        System.out.println("My other int value is " + myAnotherIntValue);

        int[] myIntArray = new int[5];
        int[] myAnotherIntArray = myIntArray;

        System.out.println("My int array is " + Arrays.toString(myIntArray));
        System.out.println("My other int array is " + Arrays.toString(myAnotherIntArray));

        myAnotherIntArray[0] = 5;

        System.out.println("My int array is " + Arrays.toString(myIntArray));
        System.out.println("My other int array is " + Arrays.toString(myAnotherIntArray));


    }
}
