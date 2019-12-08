package com.Joseph;

// You job is to create a simple banking application.
// - There should be a Bank class
// - It should have an arraylist of Branches
// - Each Branch should have an arraylist of Customers
// - The Customer class should have an arraylist of Doubles (transactions)
// Customer:
// - Name, and the ArrayList of doubles.
// Branch:
// - Need to be able to add a new customer and initial transaction amount.
// - Also needs to add additional transactions for that customer/branch

// Bank:
// - Add a new branch
// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

import java.util.Scanner;

public class Main {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        Bank bank = new Bank("Chevy Chase");

        bank.addBranch("Sterling");

        bank.addCustomer("Sterling", "Joe", 1000);
        bank.addCustomer("Sterling", "Liz", 100.34);
        bank.addCustomer("Sterling", "Diana", 900.98);

        bank.addBranch("Bristow");
        bank.addCustomer("Bristow", "Lily", 50.43);

        bank.addCustomerTransactions("Sterling", "Joe", 5000.23);
        bank.addCustomerTransactions("Sterling", "Diana", 400.23);

        bank.listCustomers("Sterling", true);



    }
}
