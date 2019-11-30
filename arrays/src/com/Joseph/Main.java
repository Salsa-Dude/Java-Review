package com.Joseph;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        int[] myIntArray1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //////////////////////////////////////////////////////////

        int[] myIntArray2 = new int[10];
        myIntArray2[0] = 1;
        myIntArray2[1] = 2;

        //////////////////////////////////////////////////////////

        int[] myIntArray3 = new int[10];

        for(int i = 0; i < myIntArray3.length; i++) {
            myIntArray3[i] = i * 10;
        }

        //////////////////////////////////////////////////////////

        Main.printArray(myIntArray3);

        //////////////////////////////////////////////////////////

        int[] myIntegers = getIntegers(5);
        for(int i = 0; i < myIntegers.length; i++) {
            System.out.println(myIntegers[i]);
        }

    }

    public static void printArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.println(i + ". " + array[i]);
        }
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for(int i = 0; i < values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }
}
