package com.rushi.dsaportfolio.Searching.BinarySearch;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Scanner;

public class OrderAgnoisticBinarySearch extends BaseProblem {
    public OrderAgnoisticBinarySearch(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() {
        int[] ascArr = {2,4,6,9,23,45,54,63,78,99};
        int[] descArr = {99,86,78,65,58,47,32,29,12,7};
        int target = 99;
        System.out.println(orderAgnoisticBinarySearch(ascArr, target));
        System.out.println(orderAgnoisticBinarySearch(descArr, target));
    }

    static int orderAgnoisticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        if(arr[start] < arr[end]) {
            return ascBinarySearch(arr, target, start, end);
        } else {
            return descBinarySearch(arr, target, start, end);
        }
    }

    static int descBinarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(target > arr[mid]) {
                end = mid - 1;
            } else if(target < arr[mid]) {
                start = mid+ 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int ascBinarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end-start)/2;
            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid+ 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    @Override
    public String getName() {
        return "Order agnostic binary search";
    }

    @Override
    public String getDescription() {
        return "Order agnostic binary search";
    }
}
