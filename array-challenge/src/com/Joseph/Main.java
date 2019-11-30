package com.Joseph;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        int[] array = getIntegers(5);
        int[] sortedArray = sortedArray(array);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Please enter the numbers you want in the array");
        int[] integers =  new int[number];

        for(int i = 0; i < integers.length; i++) {
            integers[i] = scanner.nextInt();
        }

        return integers;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ". " + array[i]);
        }
    }

    public static int[] sortedArray(int[] array) {

        // One way to copy an array
//        int[] sortedArray = new int[array.length];
//
//        for(int i = 0; i < array.length; i++) {
//            sortedArray[i] = array[i];
//        }

        // Another way to copy an array
        int[] sortedArray = Arrays.copyOf(array, array.length);

        boolean flag = true;
        int placeHolder;

        while(flag) {
            flag = false;
            for(int i = 0; i < sortedArray.length - 1; i++) {
                if(sortedArray[i] < sortedArray[i + 1]) {
                    placeHolder = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = placeHolder;
                    flag = true;
                }
            }


        }
        return sortedArray;
    }


//    public static int[] sortIntegers(int[] array){
//
//        for(int i = 0; i < array.length;i++){
//            for(int j = 0; j < array.length;j++){
//                if(array[i] >= array[j]){
//                    int x = array[i];
//                    array[i] = array[j];
//                    array[j] = x;
//                }
//            }
//        }
//
//        return array;
//    }
}
