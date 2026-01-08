package com.game.character;

public abstract class Character {
    
    // ============================
    //        ATTRIBUTES
    // ============================
    /* These store the data specifically name, health, and attack power
    for each character object. */
    
    private String name;
    private int health;
    private int attackPower;

    // ============================
    //        CONSTRUCTOR
    // ============================
    /* A special block of code that runs when you create a new instance 
     to set up the initial attributes for the characters name,health and attackpower */
    public Character(String name, int health, int attackPower) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
    }

    // ============================
    //          METHODS
    // ============================
    
    // [Method 1] Getter for Name
    public String getName() {
        return name;
    }

    // [Method 2] Getter for Health
    public int getHealth() {
        return health;
    }

    // [Method 3] Setter for Health
    protected void setHealth(int health) {
        this.health = Math.max(health, 0); // prevent negative HP
    }

    // [Method 4] Getter for Attack Power
    public int getAttackPower() {
        return attackPower;
    }

    // [Method 5] Action method
    public void attack(Character target) {
        System.out.println(name + " attacks " + target.getName() +
                " for " + attackPower + " damage.");
        target.setHealth(target.getHealth() - attackPower);
    }

    // [Method 6] Abstract Method
    /* This method has NO body/code here. Subclasses (like Mage or Warrior)
     are FORCED to provide their own version of this method.*/
    public abstract void displayInfo();
}
