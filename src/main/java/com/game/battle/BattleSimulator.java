package com.game.battle;

import com.game.character.Character;
import com.game.interfaces.SpecialMove;
import java.util.Scanner;

public class BattleSimulator {

    private static Scanner sc = new Scanner(System.in);

    public static void fight(Character p1, Character p2) {

        System.out.println("\n=== BATTLE START ===");

        int round = 1;

        while (p1.getHealth() > 0 && p2.getHealth() > 0) {
            System.out.println("\n--- Round " + round + " ---");

            playerTurn(p1, p2);
            if (p2.getHealth() <= 0) break;

            playerTurn(p2, p1);
            round++;
        }

        System.out.println("\n=== BATTLE OVER ===");
        showWinner(p1, p2);
    }

    private static void playerTurn(Character attacker, Character defender) {
        System.out.println("\n" + attacker.getName() + "'s Turn");
        System.out.println("1. Normal Attack");
        System.out.println("2. Special Move");
        System.out.print("Choose action: ");

        int choice = sc.nextInt();

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

    private static void showWinner(Character p1, Character p2) {
        if (p1.getHealth() > 0) {
            System.out.println("🏆 Winner: " + p1.getName());
        } else {
            System.out.println("🏆 Winner: " + p2.getName());
        }
    }
}
