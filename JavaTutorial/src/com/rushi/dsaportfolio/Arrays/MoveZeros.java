package com.rushi.dsaportfolio.Arrays;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeros extends BaseProblem {
    public MoveZeros(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() throws Exception {
        int[] nums = new int[]{4,2,4,0,0,3,0,5,1,0};
        int insertPos = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[insertPos];
                nums[insertPos] = temp;
                insertPos++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    @Override
    public String getName() {
        return "Move Zeros";
    }

    @Override
    public String getDescription() {
        return "Move zeros to end of array.";
    }
}