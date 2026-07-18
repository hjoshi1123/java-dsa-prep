package com.rushi.dsaportfolio.Arrays;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray extends BaseProblem {
    public ReverseArray(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() {
        int[] arr = {45, 66, 69, 32, 33, 2, 7, 49, 99};
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    @Override
    public String getName() {
        return "Reverse array";
    }

    @Override
    public String getDescription() {
        return "Reverse an array";
    }
}
