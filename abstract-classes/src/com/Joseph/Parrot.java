package com.Joseph;

public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }

    @Override
    public void swim() {
        System.out.println("Can't swim");
    }
}
