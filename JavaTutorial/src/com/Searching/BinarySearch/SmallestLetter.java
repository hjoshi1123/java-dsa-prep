package com.Searching.BinarySearch;
//Leetcode - 744
public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr = {'a','c','f','h','t','w'};
        char target = 'x';
        System.out.println(smallestLetter(arr, target));
    }

    static char smallestLetter(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        int mid = 0;
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
}
