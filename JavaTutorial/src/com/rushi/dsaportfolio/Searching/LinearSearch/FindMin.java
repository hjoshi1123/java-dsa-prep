package com.rushi.dsaportfolio.Searching.LinearSearch;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Scanner;

public class FindMin extends BaseProblem {
    public FindMin(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() throws Exception {
        int[] arr = new int[10];
        System.out.print("Enter array elements: ");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println("The min number in array is: " + min(arr));
    }

    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int num : arr) {
            if(num < min) {
                min = num;
            }
        }
        return min;
    }

    @Override
    public String getName() {
        return "Find minimum in array";
    }

    @Override
    public String getDescription() {
        return "Find minimum number in array";
    }
}
