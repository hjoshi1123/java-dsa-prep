package com.rushi.dsaportfolio.Searching.LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class SearchIn2DArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = {
                {23, 45, 33},
                {76,45, 98, 21, 1},
                {66, 42, 12, 32}
        };
        System.out.print("Enter value to search: ");
        int target = in.nextInt();
        int[] ans = searchIn2DArray(arr, target);
        System.out.println("Element found at index: " + Arrays.toString(ans));
    }

    static int[] searchIn2DArray(int[][] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == target) {
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
