package com.jwilson;

/**
 * Created by jwilson on 21/03/2017.
 */
public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Jsmes", 500);
        System.out.println("New score is:" + newScore);
        calculateScore(400);
        calculateScore();
    }

    public static int calculateScore(String playerName, int playerScore) {
        System.out.println("Player: " + playerName + " scored " + playerScore + " points");
        return 100 * playerScore;
    }

    public static int calculateScore(int playerScore) {
        System.out.println("Unnamed Player: " + " scored " + playerScore + " points");
        return 100 * playerScore;
    }

    public static int calculateScore() {
        System.out.println("No player name - no player score");
        return 0;
    }
}
