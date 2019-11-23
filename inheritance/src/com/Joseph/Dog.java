package com.Joseph;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        // brain and body variable called using super from base Animal class
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called");
    }

    public void eat() {
        System.out.println("Dog.eat() called");
        this.chew();
        super.eat();
    }

    public void walk() {
        System.out.println("Dog.walk() called");

        // Can call using super
//        super.move(30);
        move(30);
    }

    public void run() {
        System.out.println("Dog.run() called");
    }

}
