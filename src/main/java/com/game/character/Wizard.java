package com.game.character;

import com.game.interfaces.SpecialMove;

public class Wizard extends Character implements SpecialMove {

    public Wizard(String name) {
        super(name, 80, 25);
    }

    @Override
    public void useSpecialMove(Character target) {
        System.out.println(getName() + " casts Fireball!");
        target.setHealth(target.getHealth() - 40);
    }

    @Override
    public void displayInfo() {
        System.out.println("Wizard: " + getName() + " | HP: " + getHealth());
    }
}
