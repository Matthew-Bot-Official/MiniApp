package com.matthew.miniapp;

import java.util.Scanner;

public class activator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String ProductKey1 = "G5H4S-T8DDV-P43CA-R4E8D-U09WZ";
        String ProductKey2 = "Z1X6C-V3B9N-M4K2L-P8Q5R-T7Y0J";
        String ProductKey3 = "J2K8M-Q5T3V-N7B1Z-L6R4H-F9G0Y";
        String ProductKey4 = "W8E3R-A9M4K-U7D2S-L1V5B-C6X0P";
        String ProductKey5 = "R4D5B-Q9L2M-V5T8X-N3B1Z-P6D0H";

        while (true) {

            System.out.println("Please type in your Product Key to activate MiniApp");
            System.out.println("It should look like this: XXXXX-XXXXX-XXXXX-XXXXX-XXXXX");
            System.out.println();
            System.out.print("Product Key: ");

            String ProductKey = input.next();

            System.out.println();
            System.out.println("Validating Product Key...");

            if (ProductKey.equalsIgnoreCase(ProductKey1) ||
                    ProductKey.equalsIgnoreCase(ProductKey2) ||
                    ProductKey.equalsIgnoreCase(ProductKey3) ||
                    ProductKey.equalsIgnoreCase(ProductKey4) ||
                    ProductKey.equalsIgnoreCase(ProductKey5)) {
                Launcher.activated = true;
                Launcher.ProductKey = ProductKey;

                System.out.println();
                System.out.println("MiniApp has been successfully activated!");
                System.out.println();

                System.out.println("**Keep in mind that the activation will reset when you close the app**");

                System.out.println("You will be now redirected to the main menu");
                System.out.println();

                Launcher.main(null);
                return;
            } else {
                System.out.println();
                System.out.println("Failed to verify Product Key!");
                System.out.println();
            }
        }
    }
}