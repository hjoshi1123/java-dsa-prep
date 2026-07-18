package com.rushi.dsaportfolio.Searching;

import com.rushi.dsaportfolio.Searching.BinarySearch.*;
import com.rushi.dsaportfolio.core.DSAProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchingMain {
    public static void executeAll(Scanner scanner) {
        List<DSAProblem> problems = new ArrayList<>();
        problems.add(new BinarySearch(scanner));
        problems.add(new CeilingOfNumber(scanner));
        problems.add(new FirstAndLastIndex(scanner));
        problems.add(new OrderAgnoisticBinarySearch(scanner));
        problems.add(new PeakInMountainArray(scanner));
        problems.add(new SearchInInfiniteArray(scanner));
        problems.add(new SmallestLetter(scanner));

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
