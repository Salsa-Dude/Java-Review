package com.Joseph;


//   Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter.
//
//        -The method needs to read from the console until all the numbers are entered, and then return an array containing the numbers entered.
//
//        -Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array.
//
//        -In the main() method read the count from the console and call the method readIntegers() with the count parameter.
//
//        -Then call the findMin() method passing the array returned from the call to the readIntegers() method.
//
//        -Finally, print the minimum element in the array.
//
//        Tips:
//        -Assume that the user will only enter numbers, never letters
//        -For simplicity, create a Scanner as a static field to help with data input
//        -Create a new console project with the name ÅeMinElementChallengeÅf

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] myArray = readInteger(5);
        System.out.println("min number is " + findMin(myArray));

    }

    private static int[] readInteger(int count) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter " + count + " numbers");

        int[] values = new int[count];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    private static int findMin(int[] array) {
        int minNumber = array[0];

        for(int i = 0; i < array.length; i++) {
            if(array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }


}
