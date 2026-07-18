package com.rushi.dsaportfolio.basics;

import com.rushi.dsaportfolio.core.DSAProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BasicsMain {
    public static void executeAll(Scanner scanner) {
        List<DSAProblem> problems = new ArrayList<>();
        problems.add(new Fibonacci(scanner));
        problems.add(new ArmstrongNumbers(scanner));
        problems.add(new FindOccurrences(scanner));
        problems.add(new IsPrime(scanner));
        problems.add(new ReverseNumber(scanner));

        boolean exit = false;
        while(!exit) {
            System.out.println();
            System.out.println("DSA basics dashboard");
            for (int i = 0; i < problems.size(); i++) {
                System.out.printf("%d. %s\n", (i + 1), problems.get(i).getName());
            }
            System.out.printf("%d. Back to Main Menu\n", problems.size() + 1);
            System.out.print("Selection: ");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                if (choice > 0 && choice <= problems.size()) {
                    problems.get(choice - 1).run(); // Calls the abstract skeleton method!
                } else if (choice == problems.size() + 1) {
                    exit = true;
                } else {
                    System.out.println("❌ Unknown menu item.");
                }
            } else {
                System.out.println("❌ Digits only.");
                scanner.next();
            }
        }
    }
}
