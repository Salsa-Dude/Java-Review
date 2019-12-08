package com.Joseph;

// The Customer class should have an arraylist of Doubles (transactions)

import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transactions;
    private String name;

    public Customer(String name, double initialAmount) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        this.addTransaction(initialAmount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public static Customer makeCustomer(String name, double initialAmount) {
        Customer newCustomer = new Customer(name, initialAmount);
        return newCustomer;
    }



    public void addTransaction(double transactionAmount) {
        this.transactions.add(transactionAmount);
//        System.out.println("Transaction of " + transactionAmount + " has been added");
    }


}
