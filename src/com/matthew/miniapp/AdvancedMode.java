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

        String choice = input.next();

        if (choice.equalsIgnoreCase("leave")) {
            System.out.println("Returning to main menu...");
            Launcher.main(null);
        }
        else if (choice.equals("1")) {
            System.out.println();
            AdvancedMode.MCJavaRandomSeedGen(null);
            input.close();
        }
    }

    public static void MCJavaRandomSeedGen(String[] args) {;

        Random seedGen = new Random();
        long seed = seedGen.nextLong();

        System.out.println(seed);
        System.out.println();

        AdvancedMode.main(null);
    }
}