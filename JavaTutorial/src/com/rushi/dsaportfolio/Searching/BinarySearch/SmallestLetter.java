package com.rushi.dsaportfolio.Searching.BinarySearch;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Scanner;

//Leetcode - 744
public class SmallestLetter extends BaseProblem {
    public SmallestLetter(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() {
        char[] arr = {'a','c','f','h','t','w'};
        char target = 'x';
        System.out.println(smallestLetter(arr, target));
    }

    static char smallestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[start%arr.length];
    }

    @Override
    public String getName() {
        return "Smallest letter";
    }

    @Override
    public String getDescription() {
        return "Smallest letter in array";
    }
}
