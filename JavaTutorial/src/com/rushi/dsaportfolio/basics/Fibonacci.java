package com.rushi.dsaportfolio.basics;

import com.rushi.dsaportfolio.core.BaseProblem;
import java.util.Scanner;

public class Fibonacci extends BaseProblem {

    public Fibonacci(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String getName() {
        return "Find fibonacci number";
    }

    @Override
    public String getDescription() {
        return "Finds the Fibonacci number.";
    }

    @Override
    protected void executeLogic() {
        //Find nth fibonacci number
        System.out.println();
        System.out.println("Find nth fibonacci number.");
        System.out.println("Which fibonacci number do you want?");
        int fibonacciInput = scanner.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while(count <= fibonacciInput) {
            int temp = b;
            b = b+a;
            a = temp;
            count++;
        }
        System.out.println();
        System.out.printf("The %dth fibonacci number is: %d", fibonacciInput, b);
    }
}
