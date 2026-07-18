package com.rushi.dsaportfolio.Searching.BinarySearch;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Scanner;

public class BinarySearch extends BaseProblem {
    public BinarySearch(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() {
        int[] arr = {2,5,7,9,11,34,67,98};
        int target = 67;
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    @Override
    public String getName() {
        return "Binary search";
    }

    @Override
    public String getDescription() {
        return "Binary search algorithm";
    }
}
