package com.basics;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int num = in.nextInt();
        //With conversion to string
//        String reverse = "";
//        while(num > 0) {
//            int rem = num % 10;
//            reverse = reverse + rem;
//            num = num / 10;
//        }
//        System.out.println(reverse);

        //Without conversion to string
        int reverseNum = 0;
        while(num > 0) {
            int rem = num % 10;
            reverseNum = (reverseNum * 10) + rem;
            num = num / 10;
        }
        System.out.println(reverseNum);
    }
}
