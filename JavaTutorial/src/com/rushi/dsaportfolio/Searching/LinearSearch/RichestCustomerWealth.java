package com.rushi.dsaportfolio.Searching.LinearSearch;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Scanner;

//Leetcode - 1672
public class RichestCustomerWealth extends BaseProblem {
    public RichestCustomerWealth(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() throws Exception {
        int[][] persons = {
                {23, 45, 33},
                {76, 45, 21, 1},
                {66, 42, 12, 32}
        };

        System.out.println("Richest: " + findRichest(persons));
    }

    static int findRichest(int[][] persons) {
        int richest = Integer.MIN_VALUE;
        for (int[] person : persons) {
            int wealth = 0;
            for (int account : person) {
                wealth = wealth + account;
            }
            if (wealth > richest) {
                richest = wealth;
            }
        }
        return richest;
    }

    @Override
    public String getName() {
        return "Richest customer wealth";
    }

    @Override
    public String getDescription() {
        return "Find richest customer wealth.";
    }
}
