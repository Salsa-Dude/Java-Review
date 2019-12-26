package com.joseph;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
	// write your code here
//        StaticTest firstInstance = new StaticTest("1st instance");
//        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstance());
//
//        StaticTest secondInstance = new StaticTest("2nd instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstance());

        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multipler is " + multiplier);


    }

    public static int multiply(int number) {
        return number * multiplier;
    }
}
