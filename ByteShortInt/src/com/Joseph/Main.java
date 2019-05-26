package com.Joseph;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Int has a width of 32
        int myMinValue = -2147483648;
        int myMaxValue = 2147483647;

        int myMinValue2 = -2_147_483_648;
        int myMaxValue2 = 2_147_483_647;

        int myInitTotal = myMaxValue2 / 2;
        System.out.println("Int total is " + myInitTotal);

        // BYTE DataType
        // has a width of 8
        // - takes less space than a integer datatype
        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;

        byte myByteTotal = (byte) (myMinByteValue / 2);
        System.out.println("Byte total is " + myByteTotal);

        // SHORT DataType
        // has a width of 16
        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;

        short myShortTotal = (short) (myMaxShortValue / 2);
        System.out.println("Short total is " + myShortTotal);

        // LONG DataType
        // has a width of 64
        long myMinLongValue = -9_223_372_036_854_775_808L;
        long myMaxLongValue =  9_223_372_036_854_775_807L;

        long myLongTotal = (long) (myMaxLongValue / 2);
        System.out.println("Long total is " + myLongTotal);
    }
}
