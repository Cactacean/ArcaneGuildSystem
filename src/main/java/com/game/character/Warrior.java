package com.game.character;

import com.game.interfaces.SpecialMove;

public class Warrior extends Character implements SpecialMove {

    // No attributes
    /* The Warrior uses the attributes defined in the 'Character' class 
     (name, health, attackPower) via inheritance. */

    // ============================
    //        CONSTRUCTOR
    // ============================
    public Warrior(String name) {
        /* 'super' calls the constructor of the parent (Character) class
        to set the name, 120 HP, and 20 Attack Power. */
        super(name, 120, 20); 
    }

    // ============================
    //          METHODS
    // ============================

    // [Method 1] Implementation of the Interface Method
    @Override
    public void useSpecialMove(Character target) {
        System.out.println(getName() + " uses Power Strike!");
        
        // This logic changes the state (health) of the target
        target.setHealth(target.getHealth() - 35);
    }

    // [Method 2] Implementation of the Abstract Method
    @Override
    public void displayInfo() {
        System.out.println("Warrior: " + getName() + " | HP: " + getHealth());
    }
}
