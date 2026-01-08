package com.game.character;

import com.game.interfaces.SpecialMove;

public class Archer extends Character implements SpecialMove {

    public Archer(String name) {
        super(name, 100, 18);
    }

    @Override
    public void useSpecialMove(Character target) {
        System.out.println(getName() + " uses Arrow Rain!");
        target.setHealth(target.getHealth() - 30);
    }

    @Override
    public void displayInfo() {
        System.out.println("Archer: " + getName() + " | HP: " + getHealth());
    }
}
