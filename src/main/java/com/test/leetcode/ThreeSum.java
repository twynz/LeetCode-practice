package com.test.leetcode;

import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.*;

@Component
public class ThreeSum {

    int[] nums;
    int index1;
    int index2;
    int index3;
    final static int TARGET = 0;
    List<List<Integer>> result = new ArrayList<>();

    //three sum
    public List<List<Integer>> threeSum(int[] nums) {
        this.nums = nums;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                this.index1 = i;
                this.index2 = j;
                dfsThreeSum(j + 1);
            }
        }
        return result;

    }


    private void dfsThreeSum(int tempIndex) {
        if (tempIndex <= nums.length - 1) {
            if (nums[tempIndex] + nums[index1] + nums[index2] == TARGET) {
                this.index3 = tempIndex;
                List<Integer> subResult = new ArrayList<>();
                subResult.add(nums[index1]);
                subResult.add(nums[index2]);
                subResult.add(nums[index3]);
                Collections.sort(subResult);
                for(List<Integer> list : result) {
                    if(list.equals(subResult)) {
                        return;
                    }
                }
                result.add(subResult);
            } else {
                dfsThreeSum(tempIndex + 1);
            }
        }

    }

}
