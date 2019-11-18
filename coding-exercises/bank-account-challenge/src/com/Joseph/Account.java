package com.Joseph;

// Create a new class for a bank account
// Create fields for the account number, balance, customer name, email and phone number.

// Create getters and setters for each field

// Create two additional methods
// 1. To allow the customer to deposit funds (this should increment the balance field).
// 2. To allow the customer to withdraw funds. This should deduct from the balance field,
// but not allow the withdrawal to complete if their are insufficient funds.
// You will want to create various code in the Main class (the one created by IntelliJ) to
// confirm your code is working.
// Add some System.out.println's in the two methods above as well.

public class Account {

    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public void deposit(double depositAmount) {
        this.balance += depositAmount;
    }

    public void withdrawl(double withdrawlAccount) {
        if(this.balance - withdrawlAccount < 0) {
            System.out.println("Only " + this.balance + " available. Withdrawl not processed.");
        } else {
            this.balance -= withdrawlAccount;
            
        }
    }

    // Setters
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getters

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }
}
