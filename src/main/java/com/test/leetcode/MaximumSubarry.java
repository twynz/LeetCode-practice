package com.test.leetcode;

public class MaximumSubarry {


    public int maxSubArray(int[] nums) {
        int dp[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                dp[i] = nums[i];
                continue;
            }

            if (dp[i - 1] + nums[i] <= nums[i]) {
                dp[i] = nums[i];
            } else {
                dp[i] = dp[i - 1] + nums[i];
            }
        }
        int result = nums[0];
        for (int i = 0; i < dp.length; i++) {
            if (dp[i] > result) {
                result = dp[i];
            }
        }
        return result;
    }
}
