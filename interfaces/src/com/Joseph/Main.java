package com.Joseph;

//
//Another way to achieve abstraction in Java, is with interfaces.
// an interface is a group of related methods with empty bodies
// To implement this interface, the name of your class would change and you'd use the implements keyword in the class declaration:
// Implementing an interface allows a class to become more formal about the behavior it promises to provide.
// Interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler.
// If your class claims to implement an interface,
// - all methods defined by that interface must appear in the class

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone josephPhone;
        josephPhone = new DeskPhone(123456);
        josephPhone.powerOn();
        josephPhone.callPhone(123456);
        josephPhone.answer();

        josephPhone = new MobilePhone(789101112);
        josephPhone.powerOn();
        josephPhone.callPhone(789101112);
        josephPhone.answer();
    }
}
