package com.Joseph;

// There should be a Bank class
// It should have an arraylist of Branches

import java.util.ArrayList;

public class Bank {


    private ArrayList<Branch> branches = new ArrayList<Branch>();
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void addBranch(String location) {
        Branch newBranch = Branch.makeBranch(location);
        System.out.println("New Branch has been open at " + newBranch.getLocation());
    }









}
