package com.Joseph;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Sky");
        parrot.breathe();
        parrot.eat();
        parrot.fly();
    }
}
