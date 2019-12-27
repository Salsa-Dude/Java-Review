package com.joseph;

// By marking your class as final your prevent your class from being subclass or extended to
// Marking a method as final prevents the method from being overwritten

public class Main {

    public static void main(String[] args) {
	// write your code here
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        int pwt = 5432;
        Password password = new ExtendedPassword(pwt);
        password.storePassword();

        password.letMeIn(12345);
        password.letMeIn(543);
        password.letMeIn(5432);
    }
}
