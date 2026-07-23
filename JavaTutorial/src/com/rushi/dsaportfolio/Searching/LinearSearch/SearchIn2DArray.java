package com.rushi.dsaportfolio.Searching.LinearSearch;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray extends BaseProblem {
    public SearchIn2DArray(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() throws Exception {
        int[][] arr = {
                {23, 45, 33},
                {76,45, 98, 21, 1},
                {66, 42, 12, 32}
        };
        System.out.print("Enter value to search: ");
        int target = scanner.nextInt();
        int[] ans = searchIn2DArray(arr, target);
        System.out.println("Element found at index: " + Arrays.toString(ans));
    }

    static int[] searchIn2DArray(int[][] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }

    @Override
    public String getName() {
        return "Search in 2D array";
    }

    @Override
    public String getDescription() {
        return "Search number in 2D array";
    }
}
