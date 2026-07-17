package com.Searching.LinearSearch;

//Leetcode - 1672
public class RichestCustomerWealth {
    public static void main(String[] args) {
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
}
