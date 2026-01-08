package com.game.character;

import com.game.interfaces.SpecialMove;

public class Archer extends Character implements SpecialMove {

  
    // The Archer uses the attributes defined in the 'Character' class 
    // (name, health, attackPower) via inheritance.

    // ============================
    //        CONSTRUCTOR
    // ============================
    public Archer(String name) {
        // 'super' sets the values specific to an Archer:
        // Name = (user input), Health = 100, Attack Power = 18
        // This is a "balanced" build compared to the Warrior (120 HP) or Wizard (80 HP).
        super(name, 100, 18);
    }

    // ============================
    //          METHODS
    // ============================

    // [Method 1] Implementation of the Interface Method
    //Character uses special move on a specific target
    @Override
    public void useSpecialMove(Character target) {
        System.out.println(getName() + " uses Arrow Rain!");
        
        // Special move deals 30 damage (Middle ground between Warrior's 35 and Wizard's 40)
        target.setHealth(target.getHealth() - 30);
    }

    // [Method 2] Implementation of the Abstract Method
    // Displays the Archers name and hp
    @Override
    public void displayInfo() {
        System.out.println("Archer: " + getName() + " | HP: " + getHealth());
    }
}
