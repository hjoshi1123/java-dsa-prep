package com.basics;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        //Find nth fibonacci number
        Scanner input = new Scanner(System.in);
        System.out.println("Which fibonacci number do you want?");
        int fibonacciInput = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= fibonacciInput) {
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}
