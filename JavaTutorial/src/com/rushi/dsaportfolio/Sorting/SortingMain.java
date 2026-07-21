package com.rushi.dsaportfolio.Sorting;

import com.rushi.dsaportfolio.Sorting.BubbleSort.BubbleSort;
import com.rushi.dsaportfolio.core.DSAProblem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SortingMain {
    public static void executeAll(Scanner scanner) {
        List<DSAProblem> problems = new ArrayList<>();
        problems.add(new BubbleSort(scanner));
        //problems.add(new SelectionSort(scanner)); TODO:Implement this

        boolean exit = false;
        while(!exit) {
            System.out.println();
            System.out.println("Sorting dashboard");
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
                    System.out.println("Unknown menu item.");
                }
            } else {
                System.out.println("Digits only.");
                scanner.next();
            }
        }
    }
}
