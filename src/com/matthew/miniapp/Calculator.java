package com.matthew.miniapp;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        if (Launcher.activated == false) {
            activator.main(null);
        }

        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Select an operation (1-4) or type 'leave' to return to the main menu.");
            System.out.println("1) Addition");
            System.out.println("2) Subtraction");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");

            String choice = input.next();

            if (choice.equalsIgnoreCase("leave")) {
                System.out.println();
                System.out.println("Leaving Calculator...");
                System.out.println("Returning to main menu...");
                Launcher.main(null);
                break;
            }

            System.out.println("Enter first number:");
            double num1 = input.nextDouble();

            System.out.println("Enter second number:");
            double num2 = input.nextDouble();

            if (choice.equals("1")) {
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            }
            else if (choice.equals("2")) {
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
            }
            else if (choice.equals("3")) {
                System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
            }
            else if (choice.equals("4")) {
                System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
            }
            else {
                System.out.println("Invalid choice!");
            }

            System.out.println();
        }

        input.close();
    }
}