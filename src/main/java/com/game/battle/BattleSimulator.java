package com.game.battle;

import com.game.character.Character;
import com.game.interfaces.SpecialMove;
import java.util.Scanner;

public class BattleSimulator {

    
    //        ATTRIBUTE
    // ============================
    /* This is the class-level attribute. It is static so it can be used
     by the static methods below. */
    private static Scanner sc = new Scanner(System.in); 


    // ============================
    //         METHODS
    // ============================
    
    // [METHOD 1] Main logic for the battle loop
    public static void fight(Character p1, Character p2) {

        System.out.println("\n=== BATTLE START ===");

        int round = 1; // This is a LOCAL VARIABLE

        while (p1.getHealth() > 0 && p2.getHealth() > 0) {
            System.out.println("\n--- Round " + round + " ---");

            playerTurn(p1, p2); // Calling Method 2
            if (p2.getHealth() <= 0) break;

            playerTurn(p2, p1); // Calling Method 2
            round++;
        }

        System.out.println("\n=== BATTLE OVER ===");
        showWinner(p1, p2); // Calling Method 3
    }

    // [METHOD 2] Logic for a specific player's turn
    private static void playerTurn(Character attacker, Character defender) {
        System.out.println("\n" + attacker.getName() + "'s Turn");
        System.out.println("1. Normal Attack");
        System.out.println("2. Special Move");
        System.out.print("Choose action: ");

        int choice = sc.nextInt(); // Using the 'sc' attribute
        
    //Using switch cases
        switch (choice) {
            case 1:
                attacker.attack(defender);
                break;
            case 2:
                if (attacker instanceof SpecialMove) {
                    ((SpecialMove) attacker).useSpecialMove(defender);
                } else {
                    System.out.println("No special move available!");
                }
                break;
            default:
                System.out.println("Invalid choice. Turn skipped!");
        }

        System.out.println(defender.getName() +
                " HP: " + defender.getHealth());
    }

    // [METHOD 3] Logic to declare the winner
    private static void showWinner(Character p1, Character p2) {
        if (p1.getHealth() > 0) {
            System.out.println("🏆 Winner: " + p1.getName());
        } else {
            System.out.println("🏆 Winner: " + p2.getName());
        }
    }
}
