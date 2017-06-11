package com.jwilson;

/**
 * Created by jwilson on 15/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "James";
        player.health = 100;
        player.weapon = "Gun";

        int damage = 30;
        player.loseHealth(damage);
        System.out.println("The health of the player is now: " + player.healthRemaining());

        damage = 97;
        player.loseHealth(damage);
        player.health = 400;
        System.out.println("The health of the player is now: " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Paul", 100, "Sword");
        System.out.println("Enhanced players health: " + enhancedPlayer.getHealth());




    }
}
