package com.Searching.LinearSearch;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("The min number in array is: " + min(arr));
    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int num : arr) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }
}
