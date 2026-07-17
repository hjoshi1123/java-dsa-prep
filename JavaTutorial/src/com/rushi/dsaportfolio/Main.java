package com.rushi.dsaportfolio;

import com.rushi.dsaportfolio.basics.BasicsMain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while(running) {
            System.out.println("\n===================================");
            System.out.println("   ALGORITHM & DATA STRUCTURES   ");
            System.out.println("===================================");
            System.out.println("1. DSA Basics");
            System.out.println("2. Terminate Session");
            System.out.print("Select domain: ");

            if (scanner.hasNextInt()) {
                switch (scanner.nextInt()) {
                    case 1 -> BasicsMain.executeAll(scanner);
                    case 2 -> {
                        running = false;
                        System.out.println("Session terminated successfully.");
                    }
                    default -> System.out.println("Please enter a value from list.");
                }
            } else {
                System.out.println("Invalid input.");
                scanner.next();
            }
        }
        scanner.close();
    }
}
