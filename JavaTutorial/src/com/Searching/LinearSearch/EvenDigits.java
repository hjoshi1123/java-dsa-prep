package com.Searching.LinearSearch;

import java.util.Scanner;

//find-numbers-with-even-number-of-digits (leetcode)
public class EvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int[] nums = new int[5];
        System.out.print("Enter 5 numbers : ");
        for(int i = 0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int num : nums) {
            if(even(num)) {
                count++;
            }
        }
        System.out.println("Total numbers with even digits : " + count);
    }

    private static boolean even(int num) {
        if(num == 0) return false;
        if(num < 0) num = num * -1;
        int digits = 0;
        while(num > 0) {
            num = num / 10;
            digits++;
        }
        return digits % 2 == 0;
    }

    //Another way of doing the same problem
    private static boolean even2(int num) {
        if(num == 0) return false;
        if(num < 0) num = num * -1;
        return ((int)(Math.log10(num)) + 1) % 2 == 0;
    }

}
