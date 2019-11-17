package com.Joseph;

// Write a method named hasSharedDigit with two parameters of type int.
//
//        Each number should be within the range of 10 (inclusive) - 99 (inclusive).
//        If one of the numbers is not within the range, the method should return false.
//
//        The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23;
//       otherwise, the method should return false.

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(hasSharedDigit(12, 23));
    }

    public static boolean hasSharedDigit(int num1, int num2) {

        if ((num1 < 10 || num1 > 99) || (num2 < 10 || num2 > 99)) {
            return false;
        }

        while (num1 > 0) {

            int firstNumber = num1 % 10;
            int secondNumber = num2;

            while(secondNumber > 0) {
                if(firstNumber == secondNumber % 10) {
                    return true;
                }

                // divide by 10
                secondNumber /= 10;
            }

            // divide by 10
            num1 /= 10;
        }

        return false;


    }



}
