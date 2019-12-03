package com.Joseph;

import java.util.ArrayList;

public class GroceryList {

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    // regular array
    private int[] myNumbers = new int[50];

    // Using ArrayList
    private ArrayList<String> groceryList = new ArrayList<String>();


    // Add in ArrayList
    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    // Print in ArrayList
    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    // Modity in ArrayList
    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    // Modify in ArrayList (private)
    private void modifyGroceryItem(int position, String item) {
        groceryList.set(position, item);
        System.out.println("Grocery item " + (position + 1) + " has been modified.");
    }

    // Remove in ArrayList
    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if(position >= 0) {
            removeGroceryItem(position);
        }
    }

    // Remove in ArrayList (private)
    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }



    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        } else {
            return false;
        }
    }

    // IndexOf in ArrayList
    private int findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem); return boolean

        return groceryList.indexOf(searchItem);

    }
}
