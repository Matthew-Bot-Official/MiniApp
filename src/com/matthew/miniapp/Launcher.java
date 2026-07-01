package com.matthew.miniapp;

import java.util.Scanner;

public class Launcher {

    public static boolean activated = false;
    public static String ProductKey = "NOT ACTIVATED";

    public static void main(String[] args) {

        if (activated == false) {
            activator.main(null);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to MiniApp!");
        System.out.println("1) Open the Calculator");
        System.out.println("2) Quit the App");
        System.out.println("3) Open Adv. Calculator");
        System.out.println("4) Open Multiplication Tester");
        System.out.println("5) View activation");
        System.out.println("6) Beta");

        String choice = input.next();

        if (choice.equalsIgnoreCase("2")) {
            System.out.println();
            System.out.println("Goodbye!");
            System.out.println();
        } else if (choice.equalsIgnoreCase("1")) {
            System.out.println();
            System.out.println("Opening Calculator...");
            System.out.println();
            Calculator.main(null);
        } else if (choice.equalsIgnoreCase("3")) {
            System.out.println();
            System.out.println("Opening Adv. mode...");
            System.out.println();
            AdvancedMode.main(null);
        } else if (choice.equalsIgnoreCase("4")) {
            System.out.println();
            System.out.println("Opening Multiplication Tester...");
            System.out.println();
            MultiplicationTester.main(null);
        } else if (choice.equalsIgnoreCase("5")) {
            System.out.println();
            Launcher.activationCertificate(null);
        }
        else if (choice.equalsIgnoreCase("6")) {
            System.out.println();
            System.out.println("Starting Beta...");
            System.out.println();
            Beta.main(null);
        }
        else {
            System.out.println("Invalid choice. Please try again.");
        }
    }

    public static void activationCertificate(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("MiniApp");
        System.out.println("~~~~~~~");
        System.out.println("Version: 1.2");

        if (activated) {
            System.out.println("Status: Activated");
            System.out.println("Product Key: " + ProductKey);
        } else {
            System.out.println("Status: Not Activated");
            System.out.println("Product Key: ?????-?????-?????-?????-?????");
            System.out.println();
            System.out.println("WARNING it is highly illegal to be running a copy of MiniApp unactivated, we advise you to activate MiniApp!");
            System.out.println("To activate MiniApp type 'activate'.");
        }

        System.out.println();
        System.out.println("Type 'return' to go back to the main menu.");

        String choice = input.next();

        if (choice.equalsIgnoreCase("return")) {
            System.out.println();
            Launcher.main(null);
        } else if (choice.equalsIgnoreCase("activate")) {
            activator.main(null);
        }
    }
}