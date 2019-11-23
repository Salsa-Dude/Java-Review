package com.Joseph;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // initialize Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth");

        // checks if input is a integer
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();

            scanner.nextLine(); // handle next line character (enter key)

            System.out.println("Enter your name");
            // grab string input
            String name = scanner.nextLine();

            int age = 2019 - yearOfBirth;

            if(age > 0 && age < 100) {
                System.out.println("Your name is " + name + " and your age is " + age);
            } else {
                System.out.println("Invalid age");
            }

            // close Scanner
            scanner.close();

        } else {
            System.out.println("age is not a integer");
        }


    }
}
