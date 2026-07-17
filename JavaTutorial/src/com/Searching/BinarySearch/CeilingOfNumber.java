package com.Searching.BinarySearch;

public class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {3,5,8,9,16,23,45,57,63,78,89,99};
        int target = 67;
        System.out.println(ceilingOfNumber(arr, target));
    }

    static int ceilingOfNumber(int[] arr, int target) {
        if(target > arr[arr.length-1]) return -1;
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
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
}
