package com.game.character;

public abstract class Character {
    
    private String name;
    private int health;
    private int attackPower;

    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // Encapsulation (getters/setters)
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    protected void setHealth(int health) {
        this.health = Math.max(health, 0); // prevent negative HP
    }

    public int getAttackPower() {
        return attackPower;
    }

    // Common attack
    public void attack(Character target) {
        System.out.println(name + " attacks " + target.getName() +
                " for " + attackPower + " damage.");
        target.setHealth(target.getHealth() - attackPower);
    }

    // Abstract method
    public abstract void displayInfo();
}
