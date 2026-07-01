package com.matthew.miniapp;

import java.util.Scanner;
import java.util.Random;

public class AdvancedMode {

    public static void main(String[] args) {

        if (Launcher.activated == false) {
            activator.main(null);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Advanced mode!");
        System.out.println();
        System.out.println("Please pick one of the options (1) or type 'leave' to return to main menu");
        System.out.println("1) Minecraft Java random seed generator");
        System.out.println("2) 2 Dice roller");

        String choice = input.next();

        if (choice.equalsIgnoreCase("leave")) {
            System.out.println("Returning to main menu...");
            Launcher.main(null);
        } else if (choice.equals("1")) {
            System.out.println();
            AdvancedMode.MCJavaRandomSeedGen(null);
            input.close();
        } else if (choice.equalsIgnoreCase("2")) {
            System.out.println();
            AdvancedMode.twoDiceRoller(null);
            input.close();
        }
    }

    public static void MCJavaRandomSeedGen(String[] args) {

            Random seedGen = new Random();
            long seed = seedGen.nextLong();

            System.out.println(seed);
            System.out.println();

            AdvancedMode.main(null);
    }

    public static void twoDiceRoller(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the 2 Dice Roller! Type 'start' to begin rolling or 'leave' to return to main menu");

        String choice = input.next();
        int count = 10000;

        if (choice.equalsIgnoreCase("leave")) {
            System.out.println();
            System.out.println("Returning to Advanced Mode...");
            System.out.println();
            AdvancedMode.main(null);
        }
        else if (choice.equalsIgnoreCase("start"))

            while (count > 0) {
                Random diceRoller1 = new Random();
                int diceRoll1;
                diceRoll1 = diceRoller1.nextInt(1, 7);

                Random diceRoller2 = new Random();
                int diceRoll2;
                diceRoll2 = diceRoller1.nextInt(1, 7);

                int diceRoll;
                diceRoll = diceRoll1 + diceRoll2;
                System.out.println(diceRoll);
                count --;
        }
    }
}