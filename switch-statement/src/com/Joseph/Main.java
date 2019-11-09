package com.Joseph;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int switchValue = 5;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Value was 3");
                break;

            default:
                System.out.println("Was not 1 or 2 or 3");
                break;

        }
    }
}
