package com.rushi.dsaportfolio.basics;

import java.util.Scanner;

public class FindOccurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = in.nextInt();
        System.out.print("Enter a number to search: ");
        int target = in.nextInt();
        int count = 0;
        while(input > 0) {
            int rem = input % 10;
            if(rem == target) {
                count++;
            }
            input = input / 10;
        }
        System.out.println(count);
    }
}
