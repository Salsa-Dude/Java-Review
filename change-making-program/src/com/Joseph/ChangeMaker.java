package com.Joseph;

import java.util.Scanner;

public class ChangeMaker {

    public static void main(String[] args) {
	// write your code here

        int amount, originalAmount, quarters, dimes, nickles, pennies;

        System.out.println("Enter a whole number from 1 to 99");
        System.out.println("I will find a combination of coins");
        System.out.println("That equals that amount of change");

        Scanner keyboard = new Scanner(System.in);
        amount = keyboard.nextInt();

        originalAmount = amount;
        quarters = amount / 25;
        amount = amount % 25;
        dimes = amount / 10;
        amount = amount % 10;
        nickles = amount / 5;
        amount = amount % 5;
        pennies = amount;

        System.out.println(originalAmount + " cents in coins can be given as:" );
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickles + " nickels and");
        System.out.println(pennies + " pennies");


    }

}
