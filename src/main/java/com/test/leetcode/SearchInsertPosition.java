package com.test.leetcode;

import org.springframework.stereotype.Component;

@Component
public class SearchInsertPosition {

    int index;
    public int searchInsert(int[] nums, int target) {
        if(nums.length==1){
            if(target>nums[0]) {
                return 1;
            }else{
                return 0;
            }
        }
        if(nums[nums.length]<target) {
            return nums.length;
        }
        for(int i=0;i<nums.length;i++) {
            if(target>nums[i]) {
                index = i;
                continue;
            }
            else if(nums[i]==target){
                return i;
            }
            else {
                index = i;
                break;
            }
        }
        if(index == 0){
            return 0;
        }
        return index;
    }
}
