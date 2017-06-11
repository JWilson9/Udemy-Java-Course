package com.jwilson;

/**
 * Created by jwilson on 15/05/2017.
 */
public class EnhancedPlayer {

    private String name;
    private int health;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage) {
        this.health = this.health - damage;

        if (this.health <= 0) {
            System.out.println("The player is knocked out");
        }
    }

    public int getHealth() {
        return health;
    }
}
