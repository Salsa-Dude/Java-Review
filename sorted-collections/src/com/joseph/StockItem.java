package com.joseph;

// Comparable interface is used to order the objects of the user-defined class
// This interface is found in java.lang package and contains only one method named compareTo(Object).
// It provides a single sorting sequence only, i.e., you can sort the elements on the basis of single data member only.
// For example, it may be rollno, name, age or anything else.

public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0; // or can be initialized here
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public void setPrice(double price) {
        if(price > 0.0) {
            this.price = price;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >= 0 ) {
            this.quantityStock = newQuantity;
        }
    }

    // Equals checks the logical equality
    // Default equals method compares just references using == operator
    // so if you want to have custom object and implement logical equality you have to override equals method.
    @Override
    public boolean equals(Object obj) {
        System.out.println("Entering StockItem equals");

        if(obj == this) {
            return true;
        }

        if(obj == null || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }


    // Override To have more unique hashcode and less collisions.
    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    // compareTo is used more like a mathematical way of saying some object is greater than some other object.
    @Override
    public int compareTo(StockItem o) {
        System.out.println("Entering StockItem.compareTo");

        if(this == o) {
            return 0;
        }

        if(o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return "StockItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantityStock=" + quantityStock +
                '}';
    }
}
