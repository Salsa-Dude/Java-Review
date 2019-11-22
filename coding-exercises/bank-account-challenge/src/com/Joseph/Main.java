package com.Joseph;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.
//
// Create getters and setters for each field
// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class Main {

    public static void main(String[] args) {
	// write your code here

        // constructor 1
        Account josephAccount = new Account();

        josephAccount.withdrawl(100.0);
        josephAccount.deposit(50.0);

        josephAccount.withdrawl(100.0);

        // constructor 2
        Account lizAccount = new Account("69", 100.0, "Liz","liz@gmail.com", "7034435476" );
        System.out.println(lizAccount.getAccountNumber());
        System.out.println(lizAccount.getEmail());

        // constructor 3
        Account lilyAccount = new Account("Lily", "lily@gmail.com", "703");
        System.out.println(lilyAccount.getAccountNumber());
    }
}
