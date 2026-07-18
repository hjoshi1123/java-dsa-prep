package com.rushi.dsaportfolio.Arrays;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Scanner;

public class FindMax extends BaseProblem {
    public FindMax(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() {
        int[] arr = {1, 45, 67, 54, 33, 35};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    @Override
    public String getName() {
        return "Find max";
    }

    @Override
    public String getDescription() {
        return "Find max in array";
    }
}
