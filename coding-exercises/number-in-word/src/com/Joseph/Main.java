package com.Joseph;

//
//Write a method called printNumberInWord. The method has one parameter number which is the whole number.
// The method needs to print "ZERO", "ONE", "TWO", ... "NINE", "OTHER" if the int parameter number is 0, 1, 2, .... 9 or other for any other number including negative numbers. You can use if-else statement or switch statement whatever is easier for you.


public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static void printNumberInWord(int num) {

        switch(num) {
            case 0:
                System.out.println("ZERO");
                break;

            case 1:
                System.out.println("ONE");
                break;

            case 2:
                System.out.println("TWO");
                break;

            case 3:
                System.out.println("THREE");
                break;

            default:
                System.out.println("OTHER");
        }
    }
}
