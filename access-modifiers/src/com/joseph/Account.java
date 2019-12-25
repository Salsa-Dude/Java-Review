package com.joseph;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance;
    private ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();

    }

    public int getBalance() {
        return this.balance;
    }

    public void deposit(int amount) {
        if(amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);

        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(int amount) {
        int difference = this.balance - amount;
        if(difference >= 0) {
            this.transactions.add(-amount);
            this.balance -= amount;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        } else {
            System.out.println("Not enough funds to withdraw");
        }

    }

    public void calculateBalance() {
        int sum = 0;
        for(int i : this.transactions) {
            sum += i;
        }
        System.out.println("Calculated balance is " + sum);

    }
}
