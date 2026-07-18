package com.rushi.dsaportfolio.Searching.BinarySearch;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Scanner;

public class CeilingOfNumber extends BaseProblem {
    public CeilingOfNumber(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() {
        int[] arr = {3,5,8,9,16,23,45,57,63,78,89,99};
        int target = 67;
        System.out.println(ceilingOfNumber(arr, target));
    }

    static int ceilingOfNumber(int[] arr, int target) {
        if(target > arr[arr.length-1]) return -1;
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return arr[start];
    }

    @Override
    public String getName() {
        return "Ceiling of Number";
    }

    @Override
    public String getDescription() {
        return "Find ceiling of a number";
    }
}
