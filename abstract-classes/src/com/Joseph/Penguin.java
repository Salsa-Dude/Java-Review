package com.Joseph;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("I like to swim");
    }

    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
