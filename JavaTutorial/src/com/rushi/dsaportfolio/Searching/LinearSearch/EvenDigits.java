package com.rushi.dsaportfolio.Searching.LinearSearch;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Scanner;

//find-numbers-with-even-number-of-digits (leetcode)
public class EvenDigits extends BaseProblem {
    public EvenDigits(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() throws Exception {
        int count = 0;
        int[] nums = new int[5];
        System.out.print("Enter 5 numbers : ");
        for(int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
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

    @Override
    public String getName() {
        return "Even Digits";
    }

    @Override
    public String getDescription() {
        return "Find numbers with even number of digits.";
    }
}
