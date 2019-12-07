package com.Joseph;


//  Create a program that implements a simple mobile phone with the following capabilities.
//          - Able to store, modify, remove and query contact names.
//          - You will want to create a separate class for Contacts (name and phone number).
//        - Create a master class (MobilePhone) that holds the ArrayList of Contacts
//        - The MobilePhone class has the functionality listed above.
//        - Add a menu of options that are available.
//        - Options:  Quit, print list of contacts, add new contact, update existing contact, remove contact
//        - and search/find contact.
//        - When adding or updating be sure to check if the contact already exists (use name)
//        - Be sure not to expose the inner workings of the Arraylist to MobilePhone
//        - e.g. no ints, no .get(i) etc
//        - MobilePhone should do everything with Contact objects only.

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < myContacts.size(); i++) {
            System.out.println(this.myContacts.get(i).getName() + " --> " + this.myContacts.get(i).getPhoneNumber());
        }
    }

    public boolean addContact(Contact contact) {
        if(foundContact(contact.getName()) >= 0) {
            System.out.println("Contact is already in file");
            return false;
        }
        this.myContacts.add(contact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = this.foundContact(contact);
        if(foundPosition < 0) {
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted");
        return true;
    }

    public Contact queryContact(String name) {
        int position = foundContact(name);
        if(position >= 0) {
            return this.myContacts.get(position);
        }

        return null;
    }


    public String queryContact(Contact contact) {
        if(this.foundContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    private int foundContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int foundContact(String contactName) {
        for(int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if(contact.getName().equals(contactName)) {
                return i;
            }
        }

        return -1;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = this.foundContact(oldContact);
        if(foundPosition < 0) {
            System.out.println(oldContact.getName() + " was not found");
            return false;
        }
        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + "was updated to " + newContact.getName());
        return true;
    }



    public void showOptions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of contacts.");
        System.out.println("\t 2 - To add a contact");
        System.out.println("\t 3 - To update a contact");
        System.out.println("\t 4 - To remove a contact");
        System.out.println("\t 5 - To search for a contact.");
        System.out.println("\t 6 - To quit the application.");
    }

}
