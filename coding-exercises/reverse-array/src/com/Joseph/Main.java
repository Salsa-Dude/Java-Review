package com.Joseph;

//-Write a method called reverse() with an int array as a parameter.
//
//        -The method should not return any value. In other words, the method is allowed to modify the array parameter.
//
//        -In main() test the reverse() method and print the array both reversed and non-reversed.
//
//        -To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.
//
//        -For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int[] myArray = {1, 2, 3, 4, 5};
        reverse(myArray);

    }

    public static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i = 0; i < halfLength; i++) {
            // first index number
            int temp = array[i];
            // Switching the next first index number with last index number
            array[i] = array[maxIndex - i];
            // Switch the next last number with the next current number
            array[maxIndex - i] = temp;

        }

        System.out.println(Arrays.toString(array));

    }

//    public static void reverse(int[] array) {
//        int[] newArray = new int[array.length];
//        for(int i = 0; i < array.length ; i++) {
//            newArray[i] = array[(array.length - 1) - i];
//        }
//
//        System.out.println(Arrays.toString(newArray));
//    }


}
