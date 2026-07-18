package com.rushi.dsaportfolio.Searching.BinarySearch;

import com.rushi.dsaportfolio.core.BaseProblem;

import java.util.Arrays;
import java.util.Scanner;

//Leetcode - 34
public class FirstAndLastIndex extends BaseProblem {
    public FirstAndLastIndex(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void executeLogic() {
        int[] nums = {5,7,7,7,7,8,8,10};
        int target = 7;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

    static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        int start = search(nums, target, true);
        int end = search(nums,target,false);

        ans[0]=start;
        ans[1]=end;
        return ans;
    }

    static  int search(int[] nums, int target, boolean findStart) {
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid = start + (end-start)/2;
            if(target>nums[mid]) {
                start = mid+1;
            } else if(target<nums[mid]) {
                end = mid-1;
            } else {
                ans=mid;
                if(findStart) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
        return ans;
    }

    @Override
    public String getName() {
        return "First and last index";
    }

    @Override
    public String getDescription() {
        return "Find first and last index";
    }
}
