package com.Joseph;

// There should be a Bank class
// It should have an arraylist of Branches

// Add a customer to that branch with initial transaction
// Add a transaction for an existing customer for that branch
// Show a list of customers for a particular branch and optionally a list
// of their transactions
// Demonstration autoboxing and unboxing in your code
// Hint: Transactions
// Add data validation.
// e.g. check if exists, or does not exist, etc.
// Think about where you are adding the code to perform certain actions

import java.util.ArrayList;

public class Bank {


    private ArrayList<Branch> branches;
    private String name;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    public String getName() {
        return this.name;
    }

    public boolean addBranch(String branchName) {
        if(findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName));
            return true;
        }

        return false;
    }

    private Branch findBranch(String branchName) {
        for(int i = 0; i < branches.size(); i++) {
            Branch currentBranch = this.branches.get(i);
            if(currentBranch.getName().equals(branchName)) {
                return currentBranch;
            }
        }
        return null;
    }

    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = this.findBranch(branchName);

        if(branch != null) {
            return branch.newCustomer(customerName, initialAmount);
        }

        return false;
    }

    public boolean addCustomerTransactions(String branchName, String customerName, double amount) {
        Branch branch = this.findBranch(branchName);

        if(branch != null) {
            return branch.addCustomerTransactions(customerName, amount);
        }

        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = this.findBranch(branchName);

        if(branch != null) {
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            System.out.println(branchCustomers.size());

            for(int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);

                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]");
                if(showTransactions) {
                    System.out.println("Transacations");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for(int j = 0; j < transactions.size(); j++ ) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        } else {
            return false;
        }


    }











}
