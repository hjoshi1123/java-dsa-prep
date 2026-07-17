package com.basics;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isArmstrong(num));
    }
//153 = 1^3+5^3+3^3 = 153
    static boolean isArmstrong(int num) {
        if(num == 1) return true;
        int sum = 0;
        int input = num;
        while(num > 0) {
            int rem = num % 10;
            int cube = rem * rem * rem;
            sum += cube;
            num = num / 10;
        }
        return sum == input;
    }
}
