package com.game.character;

import com.game.interfaces.SpecialMove;

public class Wizard extends Character implements SpecialMove {


    // The Wizard uses the attributes defined in the 'Character' class.

    // ============================
    //        CONSTRUCTOR
    // ============================
    public Wizard(String name) {
        // 'super' sets the values specific to a Wizard:
        // Name = (user input), Health = 80, Attack Power = 25
        super(name, 80, 25);
    }

    // ============================
    //          METHODS
    // ============================

    // [Method 1] Implementation of the Interface Method
    @Override
    public void useSpecialMove(Character target) {
        System.out.println(getName() + " casts Fireball!");
        
        // Wizards deal more damage (40) with their special move compared to Warriors (35)
        target.setHealth(target.getHealth() - 40);
    }

    // [Method 2] Implementation of the Abstract Method
    @Override
    public void displayInfo() {
        System.out.println("Wizard: " + getName() + " | HP: " + getHealth());
    }
}
