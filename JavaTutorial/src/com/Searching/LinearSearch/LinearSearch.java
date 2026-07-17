package com.Searching.LinearSearch;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array numbers: ");
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.print("Enter target: ");
        int target = in.nextInt();
        int index = linearSearch(arr, target);
        System.out.println("Element found at index: " + index + 1);
    }

    static int linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) return i;
        }
        return -1;
    }
}
