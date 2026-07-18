package com.rushi.dsaportfolio.basics;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Scanner;

public class ReverseNumber extends BaseProblem {
    public ReverseNumber(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() {
        int num = scanner.nextInt();
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
        while (num > 0) {
            int rem = num % 10;
            reverseNum = (reverseNum * 10) + rem;
            num = num / 10;
        }
        System.out.printf("The reverse is %d: ", reverseNum);
    }

    @Override
    public String getName() {
        return "Reverse number";
    }

    @Override
    public String getDescription() {
        return "Reverse a number";
    }
}
