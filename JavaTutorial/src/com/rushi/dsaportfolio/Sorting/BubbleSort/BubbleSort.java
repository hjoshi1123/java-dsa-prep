package com.rushi.dsaportfolio.Sorting.BubbleSort;
import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort extends BaseProblem {
    public BubbleSort(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() {
        int[] arr = {12,5,66,41,2,32,52,87,1,7};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
    }

    @Override
    public String getName() {
        return "Bubble sort";
    }

    @Override
    public String getDescription() {
        return "Bubble sort algorithm";
    }
}
