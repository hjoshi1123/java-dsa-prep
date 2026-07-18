package com.rushi.dsaportfolio.Searching.BinarySearch;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Scanner;

//Leetcode-852/162
public class PeakInMountainArray extends BaseProblem {
    public PeakInMountainArray(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() {
        //int[] arr = {1, 2, 3, 5, 7, 6, 5, 3, 1};
        int[] arr = {0, 2, 1, 0};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid - 1]) {
                end = mid;
            } else if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    @Override
    public String getName() {
        return "Peak in mountain array";
    }

    @Override
    public String getDescription() {
        return "Find peak in mountain array";
    }
}