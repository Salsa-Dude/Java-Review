package com.Joseph;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean gameOver = true;

        int score = 500;

        if (score == 500)
            System.out.println("one line statements in a if don't require a block");

        if (gameOver) {
            int finalScore = score + 500;
        }

        // This won't work because variables in code block are only scoped to the block
//       int savedFinalScore = finalScore;
    }
}
