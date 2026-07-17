package com.rushi.dsaportfolio.Searching.BinarySearch;

public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 8, 12, 21, 27, 32, 38, 43, 54, 59, 61, 68, 75, 79, 80, 84, 91, 99};
        int target = 32;
        System.out.println(searchInInfiniteArray(arr, target));
    }

    static int searchInInfiniteArray(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        int mid = start + (end - start) / 2;
        if (target > arr[mid]) {
            start = mid + 1;
        } else if (target < arr[mid]) {
            end = mid - 1;
        } else {
            return mid;
        }
        return -1;
    }
}