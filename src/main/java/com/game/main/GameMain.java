package com.game.main;


import com.game.character.Character;
import com.game.character.Warrior;
import com.game.character.Wizard;
import com.game.battle.BattleSimulator;

/*General Coding Requirements 
Each project must contain: 
At least 3 attributes per class 
At least 2 methods per class 
A constructor in each class 
At least one overridden method //14:46 all fulfilled
A main class to test the system*/ //14:46 all fulfilled

//14:46: add 1 helper method in gamemain done at 14:54
//14:57: gamemain does not have attributes
//
public class GameMain {
    
    //helper method (method_1)
    private static void showTitle() { 
    System.out.println("=== Arcane Guild Battle System ===");
    }
    
    //method_2
    public static void main(String[] args) {
        showTitle();
        Character warrior = new Warrior("Ace");
        Character wizard = new Wizard("Merlin");

        BattleSimulator.fight(warrior, wizard);
    }
}


