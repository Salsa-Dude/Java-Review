package com.Joseph;

public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }


    @Override
    public void swim() {
        System.out.println("Can't swim");
    }
}
