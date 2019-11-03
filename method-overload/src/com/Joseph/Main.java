package com.Joseph;

// Method Overloading is a feature that allows a class to have more than one method having the same name,
// if their argument lists are different.

public class Main {

    public static void main(String[] args) {
	// write your code here
        int newScore = calculateScore("joseph", 500);
        System.out.println("new score is " + newScore);
        calculateScore(50);
        calculateScore();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("no player name, no player score");
        return 0;
    }
}
