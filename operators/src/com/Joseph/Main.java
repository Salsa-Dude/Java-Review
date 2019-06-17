package com.Joseph;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int result = 1 + 2;
        System.out.println(result);

        int previousResult = result;

        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        int num = 4;
        int num2 = 3;

        result  = num % 3;
        System.out.println(result); // remainder of 1

        result += 2;
        System.out.println(result); // 3

        boolean isAlien = false;

        if (isAlien == false)
            System.out.println("It is not an alien");

        int topScore = 100;
        if (topScore != 90)
            System.out.println("You got second place");

        if (topScore >= 100)
            System.out.println("You got the highest score");

        int secondScore = 60;
        if (topScore > secondScore && topScore < 110 )
            System.out.println("Score is greater than 60 but less than 110");

        if ((topScore > 90) || (secondScore > 90))
            System.out.println("one score is greater than 90");

        boolean isCar = false;
        if (!isCar)
            System.out.println("Car is false");

        boolean wasCar = isCar ? true : false;
        System.out.println(wasCar);

        double myFirstValue = 20;
        double mySecondValue = 80;
        double myTotal = (myFirstValue + mySecondValue) * 25;
        System.out.println(myTotal);

        double theRemainder = myTotal % 40;
        System.out.println(theRemainder);


    }
}
