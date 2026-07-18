package com.rushi.dsaportfolio.basics;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Scanner;

public class FindOccurrences extends BaseProblem {
    public FindOccurrences(Scanner scanner) {
        super(scanner);
    }

    @Override
    public String getName() {
        return "Find occurrences";
    }

    @Override
    public String getDescription() {
        return "Find occurrences of a number";
    }

    @Override
    protected void executeLogic() {
        System.out.print("Enter a number: ");
        long input = scanner.nextLong();
        long num = input;
        System.out.print("Enter a number to search: ");
        int target = scanner.nextInt();
        int count = 0;
        while(input > 0) {
            long rem = input % 10;
            if(rem == target) {
                count++;
            }
            input = input / 10;
        }
        System.out.printf("%d appears %d times in %d.",target, count, num);
    }
}
