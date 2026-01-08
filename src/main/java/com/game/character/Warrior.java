package com.game.character;

import com.game.interfaces.SpecialMove;

public class Warrior extends Character implements SpecialMove {

    public Warrior(String name) {
        super(name, 120, 20);
    }

    @Override
    public void useSpecialMove(Character target) {
        System.out.println(getName() + " uses Power Strike!");
        target.setHealth(target.getHealth() - 35);
    }

    @Override
    public void displayInfo() {
        System.out.println("Warrior: " + getName() + " | HP: " + getHealth());
    }
}
