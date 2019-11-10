package com.Joseph;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for (int i=0; i<5; i++) {
            System.out.println("loop " + i + " hello");
        }

        int count = 0;

        for(int i = 2; i < 30; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                
            }
        }

    }

    public static boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }

        for(int i = 2; i <= n/2; i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;


    }
}
