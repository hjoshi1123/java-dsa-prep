package com.rushi.dsaportfolio.basics;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Scanner;

public class ArmstrongNumbers extends BaseProblem {
    public ArmstrongNumbers(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String getName() {
        return "Armstrong number";
    }

    @Override
    public String getDescription() {
        return "Check if number is armstrong number or not";
    }

    //153 = 1^3+5^3+3^3 = 153
    @Override
    protected void executeLogic() {
        System.out.print("Enter a number to check if it is an armstrong number: ");
        int num = scanner.nextInt();
        isArmstrong(num);
    }

    void isArmstrong(int num) {
        if (num == 1) {
            System.out.printf("%d is an armstrong number", num);
            return;
        }
        int sum = 0;
        int input = num;
        while (num > 0) {
            int rem = num % 10;
            int cube = rem * rem * rem;
            sum += cube;
            num = num / 10;
        }
        if(sum == input) {
            System.out.printf("%d is an armstrong number", input);
        } else {
            System.out.printf("%d is not an armstrong number", input);
        }
    }
}
