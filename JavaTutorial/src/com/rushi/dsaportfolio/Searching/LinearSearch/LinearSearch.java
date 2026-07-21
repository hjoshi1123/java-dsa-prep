package com.rushi.dsaportfolio.Searching.LinearSearch;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Scanner;

public class LinearSearch extends BaseProblem {
    public LinearSearch(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() throws Exception {
        System.out.print("Enter array numbers: ");
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter target: ");
        int target = scanner.nextInt();
        int index = linearSearch(arr, target);
        System.out.println("Element found at index: " + index + 1);
    }

    static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return i;
        }
        return -1;
    }

    @Override
    public String getName() {
        return "Linear Search";
    }

    @Override
    public String getDescription() {
        return "Find minimum using linear search";
    }
}
