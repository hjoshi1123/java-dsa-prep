package com.rushi.dsaportfolio.basics;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Scanner;

public class IsPrime extends BaseProblem {
    public IsPrime(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() {
        int number = scanner.nextInt();
        if(number<=1) {
            System.out.printf("%d is not a prime number.", number);
        }
        int c = 2;
        while(c * c <= number) {
            if(number % c == 0) {
                System.out.printf("%d is not a prime number.", number);
            }
            c++;
        }
        if(c * c > number) {
            System.out.printf("%d is a prime number.", number);
        } else {
            System.out.printf("%d is not a prime number.", number);
        }
    }

    @Override
    public String getName() {
        return "Prime number";
    }

    @Override
    public String getDescription() {
        return "Check if the number is a prime number";
    }
}
