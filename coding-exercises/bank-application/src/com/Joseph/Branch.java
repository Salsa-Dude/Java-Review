package com.Joseph;

import java.util.ArrayList;

// Need to be able to add a new customer and initial transaction amount.
// Also needs to add additional transactions for that customer/branch

public class Branch {

    private ArrayList<Customer> customers;
    private String name;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public String getName() {
        return this.name;
    }

    public boolean newCustomer(String name, double initialAmount) {
        if(this.findCustomer(name) == null) {
            return false;
        }

        Customer newCustomer = Customer.makeCustomer(name, initialAmount);
        this.customers.add(newCustomer);
        return true;
    }


    private Customer findCustomer(String name) {
        for(int i = 0; i < customers.size(); i++) {
            Customer checkedCustomer = this.customers.get(i);
            if(checkedCustomer.getName().equals(name)) {
                return checkedCustomer;
            }
        }

        return null;
    }

    public boolean addCustomerTransactions(String customerName, double transactionAmount) {
        Customer foundCustomer = findCustomer(customerName);
        if(foundCustomer != null) {
            foundCustomer.addTransaction(transactionAmount);
            return true;
        }

        return false;

    }

    public static Branch makeBranch(String name) {
        return new Branch(name);
    }



}

