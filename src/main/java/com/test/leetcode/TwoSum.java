package com.test.leetcode;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TwoSum {

    int[] nums;
    int index1;
    int index2;
    int target;

    //two sum
    public int[] twoSum(int[] nums, int target) {
        this.target = target;
        this.nums = nums;
        for (int i = 0; i < nums.length; i++) {
            index1 = i;
            if(dfs(i+1)) {
                break;
            }
        }
        int result[]={index1,index2};
        return result;

    }

    private boolean dfs(int tempIndex) {
        if (tempIndex <= nums.length - 1) {
            if (nums[tempIndex] + nums[index1] == target) {
                this.index2 = tempIndex;
                return true;
            } else {
                return dfs(tempIndex + 1);
            }
        }
        return false;
    }


}
