package com.jwilson;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int firstScore = calculateScore(gameOver, score, levelCompleted, bonus);

        score = 1000;
        levelCompleted = 7;
        bonus = 200;

        int secondScore = calculateScore(gameOver, score, levelCompleted, bonus);

        System.out.println(" first score is: " + firstScore + " and second score is: " + secondScore);

        System.out.println("please enter your name below");
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();

        System.out.println("please enter your score below");
        Scanner scanScore = new Scanner(System.in);
        scanScore = new Scanner(System.in);
        int highScore = scanScore.nextInt();

        //displayHighScorePosition(playerName, highScore);

        int playerCorrectScore = calculateHighScore(highScore);

        String player1 = displayHighScorePosition(playerName, playerCorrectScore);
        System.out.println(player1);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
            return(finalScore);
        }else{
            return -1;
        }
    }

    public static String displayHighScorePosition(String playerName, int highScore){
        return playerName + " " + Integer.toString(highScore);
    }



    public static int calculateHighScore(int highScore){
        if (highScore > 1000 ){
            return highScore;
        }else if(highScore > 500 && highScore < 1000){
            return highScore;
        }
        else if(highScore > 100 || highScore < 500){
            return highScore;
        }else{
            highScore = 0;
            return highScore;
        }

    }

}
