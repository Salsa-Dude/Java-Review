package com.Joseph;

public class Main {


    // void method doesn't return a value

    public static void main(String[] args) {
	// write your code here
//        boolean gameOver = true;
//
//        int score = 500;

        int karenScore = calculateScore(true, 200);
        int josephScore = calculateScore(false, 1000);

        System.out.println("your score is " + karenScore);
        System.out.println("your score is " + josephScore);


    }

//    public static void calculateScore(boolean gameOver, int score) {
//
//
//        if (score == 500)
//            System.out.println("one line statements in a if don't require a block");
//
//        if (gameOver) {
//            int finalScore = score + 500;
//
//        } else {
//            System.out.println("GAME OVER!!");
//        }
//    }

    public static int calculateScore(boolean gameOver, int score) {

        int finalScore;


        if (score == 200)
            System.out.println("one line statements in a if don't require a block");

        if (gameOver) {
            finalScore = score + 500;

        } else {
            finalScore = 0;
        }

        System.out.println(finalScore);

        return finalScore;
    }

}
