package com.joseph;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Account joeAccount = new Account("Joseph");
        joeAccount.deposit(1000);
        joeAccount.withdraw(500);
        joeAccount.deposit(50);
        joeAccount.withdraw(100);

        joeAccount.calculateBalance();
        System.out.println(joeAccount.getBalance());

    }
}
