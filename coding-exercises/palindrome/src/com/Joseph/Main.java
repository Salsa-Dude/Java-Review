package com.Joseph;


// Write a method called isPalindrome with one int parameter called number.
//
//        The method needs to return a boolean.
//
//        It should return true if the number is a palindrome number otherwise it should return false.

public class Main {

    public static void main(String[] args) {
	// write your code here
        isPalindrome(11);
    }

    public static boolean isPalindrome(int number) {

        int reverse = 0;

        if(number < 0){
            number *= -1;
        }

        int num = number;

        while (num > 0) {
            int lastDigit = num % 10;
            reverse *= 10;
            reverse += lastDigit;
            num /= 10;
        }
        
        System.out.println(number);
        System.out.println(reverse);

        if (reverse == number) {
            return true;
        } else {
            return false;
        }
    }
}
