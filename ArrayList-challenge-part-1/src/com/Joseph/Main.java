package com.Joseph;


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("571 234 5467");


    public static void main(String[] args) {
	// write your code here
        boolean quit = false;
        startPhone();
        printActions();

        while(!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("\nShutting down...");
                    quit = true;
                    break;

                case 1:
                    mobilePhone.printContacts();

                case 2:
                    addNewContact();
            }
        }
    }

    private static void addNewContact() {
        System.out.println("Enter a new contact name");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phoneNumber);

        if(mobilePhone.addContact(newContact)) {
            System.out.println("New contact added: name = " + name + " phone number " + phoneNumber);
        }
    }


    private static void startPhone() {
        System.out.println("Starting phone.....");
    }

    private static void printActions() {
        System.out.println("\n Available actions: \n press");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add a new contac\n" +
                           "3 - to update a existing contact\n" +
                           "4 - to remove a existing contact\n" +
                           "5 - query if an existing contact exist\n" +
                           "6 - to print a list of available actions:");
        System.out.println("Choose your action: ");

    }
}
