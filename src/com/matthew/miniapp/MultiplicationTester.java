package com.matthew.miniapp;

import java.util.Scanner;

public class MultiplicationTester {

    public static void main(String[] args) {

        if (Launcher.activated == false) {
            activator.main(null);
        }

        Scanner input = new Scanner(System.in);

        System.out.println("What Multiplication table do you want to practice?");
        System.out.println("1) 1x table");
        System.out.println("2) 2x table");
        System.out.println("3) 3x table");
        System.out.println("4) 4x table");
        System.out.println("5) 5x table");
        System.out.println("6) 6x table");
        System.out.println("7) 7x table");
        System.out.println("8) 8x table");
        System.out.println("9) 9x table");
        System.out.println("10) 10x table");
        System.out.println("11) 11x table");
        System.out.println("12) 12x table");
        System.out.println("13) Return to main menu");

        String choice = input.next();

        if (choice.equalsIgnoreCase("13")) {
            System.out.println();
            System.out.println("Leaving Multiplication Tester...");
            System.out.println("Returning to main menu...");
            System.out.println();
            input.nextLine();
            Launcher.main(null);
        }
        else if (choice.equalsIgnoreCase("1")) {
            System.out.println();
            MultiplicationTester.oneTimesTable(null);
        }
        else if (choice.equalsIgnoreCase("2")) {
            System.out.println();
            MultiplicationTester.twoTimesTable(null);
        }
        else if (choice.equalsIgnoreCase("3")) {
            System.out.println();
            MultiplicationTester.threeTimesTable(null);
        }
        else if (choice.equalsIgnoreCase("4")) {
            System.out.println();
            MultiplicationTester.fourTimesTable(null);
        }
        else if (choice.equalsIgnoreCase("5")) {
            System.out.println();
            MultiplicationTester.fiveTimesTable(null);
        }
        else if (choice.equalsIgnoreCase("6")) {
            System.out.println();
            MultiplicationTester.sixTimesTable(null);
        }
        else if (choice.equalsIgnoreCase("7")) {
            System.out.println();
            MultiplicationTester.sevenTimesTable(null);
        }
        else if (choice.equalsIgnoreCase("8")) {
            System.out.println();
            MultiplicationTester.eightTimesTable(null);
        }
        else if (choice.equalsIgnoreCase("9")) {
            System.out.println();
            MultiplicationTester.nineTimesTable(null);
        }
        else if (choice.equalsIgnoreCase("10")) {
            System.out.println();
            MultiplicationTester.tenTimesTable(null);
        }
        else if (choice.equalsIgnoreCase("11")) {
            System.out.println();
            MultiplicationTester.elevenTimesTable(null);
        }
        else if (choice.equalsIgnoreCase("12")) {
            System.out.println();
            MultiplicationTester.twelveTimesTable(null);
        }
    }

    public static void oneTimesTable(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26;

        System.out.println("5x1=");
        q1 = input.nextInt();

        System.out.println("1x11=");
        q2 = input.nextInt();

        System.out.println("1x9=");
        q3 = input.nextInt();

        System.out.println("12x1=");
        q4 = input.nextInt();

        System.out.println("1x6=");
        q5 = input.nextInt();

        System.out.println("11x1=");
        q6 = input.nextInt();

        System.out.println("4x1=");
        q7 = input.nextInt();

        System.out.println("2x1=");
        q8 = input.nextInt();

        System.out.println("1x1=");
        q9 = input.nextInt();

        System.out.println("1x4=");
        q10 = input.nextInt();

        System.out.println("7x1=");
        q11 = input.nextInt();

        System.out.println("1x3=");
        q12 = input.nextInt();

        System.out.println("8x1=");
        q13 = input.nextInt();

        System.out.println("10x1=");
        q14 = input.nextInt();

        System.out.println("1x8=");
        q15 = input.nextInt();

        System.out.println("0x1=");
        q16 = input.nextInt();

        System.out.println("1x1=");
        q17 = input.nextInt();

        System.out.println("1x0=");
        q18 = input.nextInt();

        System.out.println("6x1=");
        q19 = input.nextInt();

        System.out.println("1x12=");
        q20 = input.nextInt();

        System.out.println("9x1=");
        q21 = input.nextInt();

        System.out.println("1x2=");
        q22 = input.nextInt();

        System.out.println("1x5=");
        q23 = input.nextInt();

        System.out.println("3x1=");
        q24 = input.nextInt();

        System.out.println("1x10=");
        q25 = input.nextInt();

        System.out.println("1x7=");
        q26 = input.nextInt();

        if (q1 == 5) score++;
        if (q2 == 11) score++;
        if (q3 == 9) score++;
        if (q4 == 12) score++;
        if (q5 == 6) score++;
        if (q6 == 11) score++;
        if (q7 == 4) score++;
        if (q8 == 2) score++;
        if (q9 == 1) score++;
        if (q10 == 4) score++;
        if (q11 == 7) score++;
        if (q12 == 3) score++;
        if (q13 == 8) score++;
        if (q14 == 10) score++;
        if (q15 == 8) score++;
        if (q16 == 0) score++;
        if (q17 == 1) score++;
        if (q18 == 0) score++;
        if (q19 == 6) score++;
        if (q20 == 12) score++;
        if (q21 == 9) score++;
        if (q22 == 2) score++;
        if (q23 == 5) score++;
        if (q24 == 3) score++;
        if (q25 == 10) score++;
        if (q26 == 7) score++;

        System.out.println("You scored " + score + "/26");

        System.out.println("Press Enter to return to the main menu...");
        input.nextLine();
        input.nextLine();

       MultiplicationTester.main(null);
    }

    public static void twoTimesTable(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26;

        System.out.println("5x2=");
        q1 = input.nextInt();

        System.out.println("2x11=");
        q2 = input.nextInt();

        System.out.println("2x9=");
        q3 = input.nextInt();

        System.out.println("12x2=");
        q4 = input.nextInt();

        System.out.println("2x6=");
        q5 = input.nextInt();

        System.out.println("11x2=");
        q6 = input.nextInt();

        System.out.println("4x2=");
        q7 = input.nextInt();

        System.out.println("2x2=");
        q8 = input.nextInt();

        System.out.println("2x1=");
        q9 = input.nextInt();

        System.out.println("2x4=");
        q10 = input.nextInt();

        System.out.println("7x2=");
        q11 = input.nextInt();

        System.out.println("2x3=");
        q12 = input.nextInt();

        System.out.println("8x2=");
        q13 = input.nextInt();

        System.out.println("10x2=");
        q14 = input.nextInt();

        System.out.println("2x8=");
        q15 = input.nextInt();

        System.out.println("0x2=");
        q16 = input.nextInt();

        System.out.println("2x1=");
        q17 = input.nextInt();

        System.out.println("2x0=");
        q18 = input.nextInt();

        System.out.println("6x2=");
        q19 = input.nextInt();

        System.out.println("2x12=");
        q20 = input.nextInt();

        System.out.println("9x2=");
        q21 = input.nextInt();

        System.out.println("2x2=");
        q22 = input.nextInt();

        System.out.println("2x5=");
        q23 = input.nextInt();

        System.out.println("3x2=");
        q24 = input.nextInt();

        System.out.println("2x10=");
        q25 = input.nextInt();

        System.out.println("2x7=");
        q26 = input.nextInt();

        if (q1 == 10) score++;
        if (q2 == 22) score++;
        if (q3 == 18) score++;
        if (q4 == 24) score++;
        if (q5 == 12) score++;
        if (q6 == 22) score++;
        if (q7 == 8) score++;
        if (q8 == 4) score++;
        if (q9 == 2) score++;
        if (q10 == 8) score++;
        if (q11 == 14) score++;
        if (q12 == 6) score++;
        if (q13 == 16) score++;
        if (q14 == 20) score++;
        if (q15 == 16) score++;
        if (q16 == 0) score++;
        if (q17 == 2) score++;
        if (q18 == 0) score++;
        if (q19 == 12) score++;
        if (q20 == 24) score++;
        if (q21 == 18) score++;
        if (q22 == 4) score++;
        if (q23 == 10) score++;
        if (q24 == 6) score++;
        if (q25 == 20) score++;
        if (q26 == 14) score++;

        System.out.println("You scored " + score + "/26");

        System.out.println("Press Enter to return to the main menu...");
        input.nextLine();
        input.nextLine();

        MultiplicationTester.main(null);
    }

    public static void threeTimesTable(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26;

        System.out.println("5x3=");
        q1 = input.nextInt();

        System.out.println("3x11=");
        q2 = input.nextInt();

        System.out.println("3x9=");
        q3 = input.nextInt();

        System.out.println("12x3=");
        q4 = input.nextInt();

        System.out.println("3x6=");
        q5 = input.nextInt();

        System.out.println("11x3=");
        q6 = input.nextInt();

        System.out.println("4x3=");
        q7 = input.nextInt();

        System.out.println("3x2=");
        q8 = input.nextInt();

        System.out.println("3x1=");
        q9 = input.nextInt();

        System.out.println("3x4=");
        q10 = input.nextInt();

        System.out.println("7x3=");
        q11 = input.nextInt();

        System.out.println("3x3=");
        q12 = input.nextInt();

        System.out.println("8x3=");
        q13 = input.nextInt();

        System.out.println("10x3=");
        q14 = input.nextInt();

        System.out.println("3x8=");
        q15 = input.nextInt();

        System.out.println("0x3=");
        q16 = input.nextInt();

        System.out.println("3x1=");
        q17 = input.nextInt();

        System.out.println("3x0=");
        q18 = input.nextInt();

        System.out.println("6x3=");
        q19 = input.nextInt();

        System.out.println("3x12=");
        q20 = input.nextInt();

        System.out.println("9x3=");
        q21 = input.nextInt();

        System.out.println("3x2=");
        q22 = input.nextInt();

        System.out.println("3x5=");
        q23 = input.nextInt();

        System.out.println("3x3=");
        q24 = input.nextInt();

        System.out.println("3x10=");
        q25 = input.nextInt();

        System.out.println("3x7=");
        q26 = input.nextInt();

        if (q1 == 15) score++;
        if (q2 == 33) score++;
        if (q3 == 27) score++;
        if (q4 == 36) score++;
        if (q5 == 18) score++;
        if (q6 == 33) score++;
        if (q7 == 12) score++;
        if (q8 == 6) score++;
        if (q9 == 3) score++;
        if (q10 == 12) score++;
        if (q11 == 21) score++;
        if (q12 == 9) score++;
        if (q13 == 24) score++;
        if (q14 == 30) score++;
        if (q15 == 24) score++;
        if (q16 == 0) score++;
        if (q17 == 3) score++;
        if (q18 == 0) score++;
        if (q19 == 18) score++;
        if (q20 == 36) score++;
        if (q21 == 27) score++;
        if (q22 == 6) score++;
        if (q23 == 15) score++;
        if (q24 == 9) score++;
        if (q25 == 30) score++;
        if (q26 == 21) score++;

        System.out.println("You scored " + score + "/26");

        System.out.println("Press Enter to return to the main menu...");
        input.nextLine();
        input.nextLine();

        MultiplicationTester.main(null);
    }

    public static void fourTimesTable(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26;

        System.out.println("5x4=");
        q1 = input.nextInt();

        System.out.println("4x11=");
        q2 = input.nextInt();

        System.out.println("4x9=");
        q3 = input.nextInt();

        System.out.println("12x4=");
        q4 = input.nextInt();

        System.out.println("4x6=");
        q5 = input.nextInt();

        System.out.println("11x4=");
        q6 = input.nextInt();

        System.out.println("4x4=");
        q7 = input.nextInt();

        System.out.println("4x2=");
        q8 = input.nextInt();

        System.out.println("4x1=");
        q9 = input.nextInt();

        System.out.println("4x4=");
        q10 = input.nextInt();

        System.out.println("7x4=");
        q11 = input.nextInt();

        System.out.println("4x3=");
        q12 = input.nextInt();

        System.out.println("8x4=");
        q13 = input.nextInt();

        System.out.println("10x4=");
        q14 = input.nextInt();

        System.out.println("4x8=");
        q15 = input.nextInt();

        System.out.println("0x4=");
        q16 = input.nextInt();

        System.out.println("4x1=");
        q17 = input.nextInt();

        System.out.println("4x0=");
        q18 = input.nextInt();

        System.out.println("6x4=");
        q19 = input.nextInt();

        System.out.println("4x12=");
        q20 = input.nextInt();

        System.out.println("9x4=");
        q21 = input.nextInt();

        System.out.println("4x2=");
        q22 = input.nextInt();

        System.out.println("4x5=");
        q23 = input.nextInt();

        System.out.println("3x4=");
        q24 = input.nextInt();

        System.out.println("4x10=");
        q25 = input.nextInt();

        System.out.println("4x7=");
        q26 = input.nextInt();

        if (q1 == 20) score++;
        if (q2 == 44) score++;
        if (q3 == 36) score++;
        if (q4 == 48) score++;
        if (q5 == 24) score++;
        if (q6 == 44) score++;
        if (q7 == 16) score++;
        if (q8 == 8) score++;
        if (q9 == 4) score++;
        if (q10 == 16) score++;
        if (q11 == 28) score++;
        if (q12 == 12) score++;
        if (q13 == 32) score++;
        if (q14 == 40) score++;
        if (q15 == 32) score++;
        if (q16 == 0) score++;
        if (q17 == 4) score++;
        if (q18 == 0) score++;
        if (q19 == 24) score++;
        if (q20 == 48) score++;
        if (q21 == 36) score++;
        if (q22 == 8) score++;
        if (q23 == 20) score++;
        if (q24 == 12) score++;
        if (q25 == 40) score++;
        if (q26 == 28) score++;

        System.out.println("You scored " + score + "/26");

        System.out.println("Press Enter to return to the main menu...");
        input.nextLine();
        input.nextLine();

        MultiplicationTester.main(null);
    }

    public static void fiveTimesTable(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26;

        System.out.println("5x5=");
        q1 = input.nextInt();

        System.out.println("5x11=");
        q2 = input.nextInt();

        System.out.println("5x9=");
        q3 = input.nextInt();

        System.out.println("12x5=");
        q4 = input.nextInt();

        System.out.println("5x6=");
        q5 = input.nextInt();

        System.out.println("11x5=");
        q6 = input.nextInt();

        System.out.println("4x5=");
        q7 = input.nextInt();

        System.out.println("5x2=");
        q8 = input.nextInt();

        System.out.println("5x1=");
        q9 = input.nextInt();

        System.out.println("5x4=");
        q10 = input.nextInt();

        System.out.println("7x5=");
        q11 = input.nextInt();

        System.out.println("5x3=");
        q12 = input.nextInt();

        System.out.println("8x5=");
        q13 = input.nextInt();

        System.out.println("10x5=");
        q14 = input.nextInt();

        System.out.println("5x8=");
        q15 = input.nextInt();

        System.out.println("0x5=");
        q16 = input.nextInt();

        System.out.println("5x1=");
        q17 = input.nextInt();

        System.out.println("5x0=");
        q18 = input.nextInt();

        System.out.println("6x5=");
        q19 = input.nextInt();

        System.out.println("5x12=");
        q20 = input.nextInt();

        System.out.println("9x5=");
        q21 = input.nextInt();

        System.out.println("5x2=");
        q22 = input.nextInt();

        System.out.println("5x5=");
        q23 = input.nextInt();

        System.out.println("3x5=");
        q24 = input.nextInt();

        System.out.println("5x10=");
        q25 = input.nextInt();

        System.out.println("5x7=");
        q26 = input.nextInt();

        if (q1 == 25) score++;
        if (q2 == 55) score++;
        if (q3 == 45) score++;
        if (q4 == 60) score++;
        if (q5 == 30) score++;
        if (q6 == 55) score++;
        if (q7 == 20) score++;
        if (q8 == 10) score++;
        if (q9 == 5) score++;
        if (q10 == 20) score++;
        if (q11 == 35) score++;
        if (q12 == 15) score++;
        if (q13 == 40) score++;
        if (q14 == 50) score++;
        if (q15 == 40) score++;
        if (q16 == 0) score++;
        if (q17 == 5) score++;
        if (q18 == 0) score++;
        if (q19 == 30) score++;
        if (q20 == 60) score++;
        if (q21 == 45) score++;
        if (q22 == 10) score++;
        if (q23 == 25) score++;
        if (q24 == 15) score++;
        if (q25 == 50) score++;
        if (q26 == 35) score++;

        System.out.println("You scored " + score + "/26");

        System.out.println("Press Enter to return to the main menu...");
        input.nextLine();
        input.nextLine();

        MultiplicationTester.main(null);
    }

    public static void sixTimesTable(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26;

        System.out.println("5x6=");
        q1 = input.nextInt();

        System.out.println("6x11=");
        q2 = input.nextInt();

        System.out.println("6x9=");
        q3 = input.nextInt();

        System.out.println("12x6=");
        q4 = input.nextInt();

        System.out.println("6x6=");
        q5 = input.nextInt();

        System.out.println("11x6=");
        q6 = input.nextInt();

        System.out.println("4x6=");
        q7 = input.nextInt();

        System.out.println("6x2=");
        q8 = input.nextInt();

        System.out.println("6x1=");
        q9 = input.nextInt();

        System.out.println("6x4=");
        q10 = input.nextInt();

        System.out.println("7x6=");
        q11 = input.nextInt();

        System.out.println("6x3=");
        q12 = input.nextInt();

        System.out.println("8x6=");
        q13 = input.nextInt();

        System.out.println("10x6=");
        q14 = input.nextInt();

        System.out.println("6x8=");
        q15 = input.nextInt();

        System.out.println("0x6=");
        q16 = input.nextInt();

        System.out.println("6x1=");
        q17 = input.nextInt();

        System.out.println("6x0=");
        q18 = input.nextInt();

        System.out.println("6x6=");
        q19 = input.nextInt();

        System.out.println("6x12=");
        q20 = input.nextInt();

        System.out.println("9x6=");
        q21 = input.nextInt();

        System.out.println("6x2=");
        q22 = input.nextInt();

        System.out.println("6x5=");
        q23 = input.nextInt();

        System.out.println("3x6=");
        q24 = input.nextInt();

        System.out.println("6x10=");
        q25 = input.nextInt();

        System.out.println("6x7=");
        q26 = input.nextInt();

        if (q1 == 30) score++;
        if (q2 == 66) score++;
        if (q3 == 54) score++;
        if (q4 == 72) score++;
        if (q5 == 36) score++;
        if (q6 == 66) score++;
        if (q7 == 24) score++;
        if (q8 == 12) score++;
        if (q9 == 6) score++;
        if (q10 == 24) score++;
        if (q11 == 42) score++;
        if (q12 == 18) score++;
        if (q13 == 48) score++;
        if (q14 == 60) score++;
        if (q15 == 48) score++;
        if (q16 == 0) score++;
        if (q17 == 6) score++;
        if (q18 == 0) score++;
        if (q19 == 36) score++;
        if (q20 == 72) score++;
        if (q21 == 54) score++;
        if (q22 == 12) score++;
        if (q23 == 30) score++;
        if (q24 == 18) score++;
        if (q25 == 60) score++;
        if (q26 == 42) score++;

        System.out.println("You scored " + score + "/26");

        System.out.println("Press Enter to return to the main menu...");
        input.nextLine();
        input.nextLine();

        MultiplicationTester.main(null);
    }

    public static void sevenTimesTable(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26;

        System.out.println("5x7=");
        q1 = input.nextInt();

        System.out.println("7x11=");
        q2 = input.nextInt();

        System.out.println("7x9=");
        q3 = input.nextInt();

        System.out.println("12x7=");
        q4 = input.nextInt();

        System.out.println("7x6=");
        q5 = input.nextInt();

        System.out.println("11x7=");
        q6 = input.nextInt();

        System.out.println("4x7=");
        q7 = input.nextInt();

        System.out.println("7x2=");
        q8 = input.nextInt();

        System.out.println("7x1=");
        q9 = input.nextInt();

        System.out.println("7x4=");
        q10 = input.nextInt();

        System.out.println("7x7=");
        q11 = input.nextInt();

        System.out.println("7x3=");
        q12 = input.nextInt();

        System.out.println("8x7=");
        q13 = input.nextInt();

        System.out.println("10x7=");
        q14 = input.nextInt();

        System.out.println("7x8=");
        q15 = input.nextInt();

        System.out.println("0x7=");
        q16 = input.nextInt();

        System.out.println("7x1=");
        q17 = input.nextInt();

        System.out.println("7x0=");
        q18 = input.nextInt();

        System.out.println("6x7=");
        q19 = input.nextInt();

        System.out.println("7x12=");
        q20 = input.nextInt();

        System.out.println("9x7=");
        q21 = input.nextInt();

        System.out.println("7x2=");
        q22 = input.nextInt();

        System.out.println("7x5=");
        q23 = input.nextInt();

        System.out.println("3x7=");
        q24 = input.nextInt();

        System.out.println("7x10=");
        q25 = input.nextInt();

        System.out.println("7x7=");
        q26 = input.nextInt();

        if (q1 == 35) score++;
        if (q2 == 77) score++;
        if (q3 == 63) score++;
        if (q4 == 84) score++;
        if (q5 == 42) score++;
        if (q6 == 77) score++;
        if (q7 == 28) score++;
        if (q8 == 14) score++;
        if (q9 == 7) score++;
        if (q10 == 28) score++;
        if (q11 == 49) score++;
        if (q12 == 21) score++;
        if (q13 == 56) score++;
        if (q14 == 70) score++;
        if (q15 == 56) score++;
        if (q16 == 0) score++;
        if (q17 == 7) score++;
        if (q18 == 0) score++;
        if (q19 == 42) score++;
        if (q20 == 84) score++;
        if (q21 == 63) score++;
        if (q22 == 14) score++;
        if (q23 == 35) score++;
        if (q24 == 21) score++;
        if (q25 == 70) score++;
        if (q26 == 49) score++;

        System.out.println("You scored " + score + "/26");

        System.out.println("Press Enter to return to the main menu...");
        input.nextLine();
        input.nextLine();

        MultiplicationTester.main(null);
    }

    public static void eightTimesTable(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26;

        System.out.println("5x8=");
        q1 = input.nextInt();

        System.out.println("8x11=");
        q2 = input.nextInt();

        System.out.println("8x9=");
        q3 = input.nextInt();

        System.out.println("12x8=");
        q4 = input.nextInt();

        System.out.println("8x6=");
        q5 = input.nextInt();

        System.out.println("11x8=");
        q6 = input.nextInt();

        System.out.println("4x8=");
        q7 = input.nextInt();

        System.out.println("8x2=");
        q8 = input.nextInt();

        System.out.println("8x1=");
        q9 = input.nextInt();

        System.out.println("8x4=");
        q10 = input.nextInt();

        System.out.println("7x8=");
        q11 = input.nextInt();

        System.out.println("8x3=");
        q12 = input.nextInt();

        System.out.println("8x8=");
        q13 = input.nextInt();

        System.out.println("10x8=");
        q14 = input.nextInt();

        System.out.println("8x8=");
        q15 = input.nextInt();

        System.out.println("0x8=");
        q16 = input.nextInt();

        System.out.println("8x1=");
        q17 = input.nextInt();

        System.out.println("8x0=");
        q18 = input.nextInt();

        System.out.println("6x8=");
        q19 = input.nextInt();

        System.out.println("8x12=");
        q20 = input.nextInt();

        System.out.println("9x8=");
        q21 = input.nextInt();

        System.out.println("8x2=");
        q22 = input.nextInt();

        System.out.println("8x5=");
        q23 = input.nextInt();

        System.out.println("3x8=");
        q24 = input.nextInt();

        System.out.println("8x10=");
        q25 = input.nextInt();

        System.out.println("8x7=");
        q26 = input.nextInt();

        if (q1 == 40) score++;
        if (q2 == 88) score++;
        if (q3 == 72) score++;
        if (q4 == 96) score++;
        if (q5 == 48) score++;
        if (q6 == 88) score++;
        if (q7 == 32) score++;
        if (q8 == 16) score++;
        if (q9 == 8) score++;
        if (q10 == 32) score++;
        if (q11 == 56) score++;
        if (q12 == 24) score++;
        if (q13 == 64) score++;
        if (q14 == 80) score++;
        if (q15 == 64) score++;
        if (q16 == 0) score++;
        if (q17 == 8) score++;
        if (q18 == 0) score++;
        if (q19 == 48) score++;
        if (q20 == 96) score++;
        if (q21 == 72) score++;
        if (q22 == 16) score++;
        if (q23 == 40) score++;
        if (q24 == 24) score++;
        if (q25 == 80) score++;
        if (q26 == 56) score++;

        System.out.println("You scored " + score + "/26");

        System.out.println("Press Enter to return to the main menu...");
        input.nextLine();
        input.nextLine();

        MultiplicationTester.main(null);
    }

    public static void nineTimesTable(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26;

        System.out.println("5x9=");
        q1 = input.nextInt();

        System.out.println("9x11=");
        q2 = input.nextInt();

        System.out.println("9x9=");
        q3 = input.nextInt();

        System.out.println("12x9=");
        q4 = input.nextInt();

        System.out.println("9x6=");
        q5 = input.nextInt();

        System.out.println("11x9=");
        q6 = input.nextInt();

        System.out.println("4x9=");
        q7 = input.nextInt();

        System.out.println("9x2=");
        q8 = input.nextInt();

        System.out.println("9x1=");
        q9 = input.nextInt();

        System.out.println("9x4=");
        q10 = input.nextInt();

        System.out.println("7x9=");
        q11 = input.nextInt();

        System.out.println("9x3=");
        q12 = input.nextInt();

        System.out.println("8x9=");
        q13 = input.nextInt();

        System.out.println("10x9=");
        q14 = input.nextInt();

        System.out.println("9x8=");
        q15 = input.nextInt();

        System.out.println("0x9=");
        q16 = input.nextInt();

        System.out.println("9x1=");
        q17 = input.nextInt();

        System.out.println("9x0=");
        q18 = input.nextInt();

        System.out.println("6x9=");
        q19 = input.nextInt();

        System.out.println("9x12=");
        q20 = input.nextInt();

        System.out.println("9x9=");
        q21 = input.nextInt();

        System.out.println("9x2=");
        q22 = input.nextInt();

        System.out.println("9x5=");
        q23 = input.nextInt();

        System.out.println("3x9=");
        q24 = input.nextInt();

        System.out.println("9x10=");
        q25 = input.nextInt();

        System.out.println("9x7=");
        q26 = input.nextInt();

        if (q1 == 45) score++;
        if (q2 == 99) score++;
        if (q3 == 81) score++;
        if (q4 == 108) score++;
        if (q5 == 54) score++;
        if (q6 == 99) score++;
        if (q7 == 36) score++;
        if (q8 == 18) score++;
        if (q9 == 9) score++;
        if (q10 == 36) score++;
        if (q11 == 63) score++;
        if (q12 == 27) score++;
        if (q13 == 72) score++;
        if (q14 == 90) score++;
        if (q15 == 72) score++;
        if (q16 == 0) score++;
        if (q17 == 9) score++;
        if (q18 == 0) score++;
        if (q19 == 54) score++;
        if (q20 == 108) score++;
        if (q21 == 81) score++;
        if (q22 == 18) score++;
        if (q23 == 45) score++;
        if (q24 == 27) score++;
        if (q25 == 90) score++;
        if (q26 == 63) score++;

        System.out.println("You scored " + score + "/26");

        System.out.println("Press Enter to return to the main menu...");
        input.nextLine();
        input.nextLine();

        MultiplicationTester.main(null);
    }

    public static void tenTimesTable(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26;

        System.out.println("5x10=");
        q1 = input.nextInt();

        System.out.println("10x11=");
        q2 = input.nextInt();

        System.out.println("10x9=");
        q3 = input.nextInt();

        System.out.println("12x10=");
        q4 = input.nextInt();

        System.out.println("10x6=");
        q5 = input.nextInt();

        System.out.println("11x10=");
        q6 = input.nextInt();

        System.out.println("4x10=");
        q7 = input.nextInt();

        System.out.println("10x2=");
        q8 = input.nextInt();

        System.out.println("10x1=");
        q9 = input.nextInt();

        System.out.println("10x4=");
        q10 = input.nextInt();

        System.out.println("7x10=");
        q11 = input.nextInt();

        System.out.println("10x3=");
        q12 = input.nextInt();

        System.out.println("8x10=");
        q13 = input.nextInt();

        System.out.println("10x10=");
        q14 = input.nextInt();

        System.out.println("10x8=");
        q15 = input.nextInt();

        System.out.println("0x10=");
        q16 = input.nextInt();

        System.out.println("10x1=");
        q17 = input.nextInt();

        System.out.println("10x0=");
        q18 = input.nextInt();

        System.out.println("6x10=");
        q19 = input.nextInt();

        System.out.println("10x12=");
        q20 = input.nextInt();

        System.out.println("9x10=");
        q21 = input.nextInt();

        System.out.println("10x2=");
        q22 = input.nextInt();

        System.out.println("10x5=");
        q23 = input.nextInt();

        System.out.println("3x10=");
        q24 = input.nextInt();

        System.out.println("10x10=");
        q25 = input.nextInt();

        System.out.println("10x7=");
        q26 = input.nextInt();

        if (q1 == 50) score++;
        if (q2 == 110) score++;
        if (q3 == 90) score++;
        if (q4 == 120) score++;
        if (q5 == 60) score++;
        if (q6 == 110) score++;
        if (q7 == 40) score++;
        if (q8 == 20) score++;
        if (q9 == 10) score++;
        if (q10 == 40) score++;
        if (q11 == 70) score++;
        if (q12 == 30) score++;
        if (q13 == 80) score++;
        if (q14 == 100) score++;
        if (q15 == 80) score++;
        if (q16 == 0) score++;
        if (q17 == 10) score++;
        if (q18 == 0) score++;
        if (q19 == 60) score++;
        if (q20 == 120) score++;
        if (q21 == 90) score++;
        if (q22 == 20) score++;
        if (q23 == 50) score++;
        if (q24 == 30) score++;
        if (q25 == 100) score++;
        if (q26 == 70) score++;

        System.out.println("You scored " + score + "/26");

        System.out.println("Press Enter to return to the main menu...");
        input.nextLine();
        input.nextLine();

        MultiplicationTester.main(null);
    }

    public static void elevenTimesTable(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26;

        System.out.println("5x11=");
        q1 = input.nextInt();

        System.out.println("11x11=");
        q2 = input.nextInt();

        System.out.println("11x9=");
        q3 = input.nextInt();

        System.out.println("12x11=");
        q4 = input.nextInt();

        System.out.println("11x6=");
        q5 = input.nextInt();

        System.out.println("11x11=");
        q6 = input.nextInt();

        System.out.println("4x11=");
        q7 = input.nextInt();

        System.out.println("11x2=");
        q8 = input.nextInt();

        System.out.println("11x1=");
        q9 = input.nextInt();

        System.out.println("11x4=");
        q10 = input.nextInt();

        System.out.println("7x11=");
        q11 = input.nextInt();

        System.out.println("11x3=");
        q12 = input.nextInt();

        System.out.println("8x11=");
        q13 = input.nextInt();

        System.out.println("10x11=");
        q14 = input.nextInt();

        System.out.println("11x8=");
        q15 = input.nextInt();

        System.out.println("0x11=");
        q16 = input.nextInt();

        System.out.println("11x1=");
        q17 = input.nextInt();

        System.out.println("11x0=");
        q18 = input.nextInt();

        System.out.println("6x11=");
        q19 = input.nextInt();

        System.out.println("11x12=");
        q20 = input.nextInt();

        System.out.println("9x11=");
        q21 = input.nextInt();

        System.out.println("11x2=");
        q22 = input.nextInt();

        System.out.println("11x5=");
        q23 = input.nextInt();

        System.out.println("3x11=");
        q24 = input.nextInt();

        System.out.println("11x10=");
        q25 = input.nextInt();

        System.out.println("11x7=");
        q26 = input.nextInt();

        if (q1 == 55) score++;
        if (q2 == 121) score++;
        if (q3 == 99) score++;
        if (q4 == 132) score++;
        if (q5 == 66) score++;
        if (q6 == 121) score++;
        if (q7 == 44) score++;
        if (q8 == 22) score++;
        if (q9 == 11) score++;
        if (q10 == 44) score++;
        if (q11 == 77) score++;
        if (q12 == 33) score++;
        if (q13 == 88) score++;
        if (q14 == 110) score++;
        if (q15 == 88) score++;
        if (q16 == 0) score++;
        if (q17 == 11) score++;
        if (q18 == 0) score++;
        if (q19 == 66) score++;
        if (q20 == 132) score++;
        if (q21 == 99) score++;
        if (q22 == 22) score++;
        if (q23 == 55) score++;
        if (q24 == 33) score++;
        if (q25 == 110) score++;
        if (q26 == 77) score++;

        System.out.println("You scored " + score + "/26");

        System.out.println("Press Enter to return to the main menu...");
        input.nextLine();
        input.nextLine();

        MultiplicationTester.main(null);
    }

    public static void twelveTimesTable(String[] args) {

        Scanner input = new Scanner(System.in);

        int score = 0;

        int q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, q11, q12, q13, q14, q15, q16, q17, q18, q19, q20, q21, q22, q23, q24, q25, q26;

        System.out.println("5x12=");
        q1 = input.nextInt();

        System.out.println("12x11=");
        q2 = input.nextInt();

        System.out.println("12x9=");
        q3 = input.nextInt();

        System.out.println("12x12=");
        q4 = input.nextInt();

        System.out.println("12x6=");
        q5 = input.nextInt();

        System.out.println("11x12=");
        q6 = input.nextInt();

        System.out.println("4x12=");
        q7 = input.nextInt();

        System.out.println("12x2=");
        q8 = input.nextInt();

        System.out.println("12x1=");
        q9 = input.nextInt();

        System.out.println("12x4=");
        q10 = input.nextInt();

        System.out.println("7x12=");
        q11 = input.nextInt();

        System.out.println("12x3=");
        q12 = input.nextInt();

        System.out.println("8x12=");
        q13 = input.nextInt();

        System.out.println("10x12=");
        q14 = input.nextInt();

        System.out.println("12x8=");
        q15 = input.nextInt();

        System.out.println("0x12=");
        q16 = input.nextInt();

        System.out.println("12x1=");
        q17 = input.nextInt();

        System.out.println("12x0=");
        q18 = input.nextInt();

        System.out.println("6x12=");
        q19 = input.nextInt();

        System.out.println("12x12=");
        q20 = input.nextInt();

        System.out.println("9x12=");
        q21 = input.nextInt();

        System.out.println("12x2=");
        q22 = input.nextInt();

        System.out.println("12x5=");
        q23 = input.nextInt();

        System.out.println("3x12=");
        q24 = input.nextInt();

        System.out.println("12x10=");
        q25 = input.nextInt();

        System.out.println("12x7=");
        q26 = input.nextInt();

        if (q1 == 60) score++;
        if (q2 == 132) score++;
        if (q3 == 108) score++;
        if (q4 == 144) score++;
        if (q5 == 72) score++;
        if (q6 == 132) score++;
        if (q7 == 48) score++;
        if (q8 == 24) score++;
        if (q9 == 12) score++;
        if (q10 == 48) score++;
        if (q11 == 84) score++;
        if (q12 == 36) score++;
        if (q13 == 96) score++;
        if (q14 == 120) score++;
        if (q15 == 96) score++;
        if (q16 == 0) score++;
        if (q17 == 12) score++;
        if (q18 == 0) score++;
        if (q19 == 72) score++;
        if (q20 == 144) score++;
        if (q21 == 108) score++;
        if (q22 == 24) score++;
        if (q23 == 60) score++;
        if (q24 == 36) score++;
        if (q25 == 120) score++;
        if (q26 == 84) score++;

        System.out.println("You scored " + score + "/26");

        System.out.println("Press Enter to return to the main menu...");
        input.nextLine();
        input.nextLine();

        MultiplicationTester.main(null);
    }
}