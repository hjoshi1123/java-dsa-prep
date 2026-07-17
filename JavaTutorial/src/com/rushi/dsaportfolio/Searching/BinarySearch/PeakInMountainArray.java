package com.rushi.dsaportfolio.Searching.BinarySearch;
//Leetcode-852/162
public class PeakInMountainArray {
    public static void main(String[] args) {
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
}