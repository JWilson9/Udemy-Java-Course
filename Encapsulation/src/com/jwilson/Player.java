package com.jwilson;

/**
 * Created by jwilson on 15/05/2017.
 */
public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;

        if (this.health <= 0) {
            System.out.println("The player is knocked out");
        }
    }

    public int healthRemaining() {
        return this.health;
    }

}
