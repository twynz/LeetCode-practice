package com.test.leetcode;

import org.springframework.stereotype.Component;

@Component
public class ClimbStaires {

    public int climbStairs(int n) {
        int dp[] = new int[n+1];

        if(n==1) {
            return 1;
        }
        if(n==2) {
            return 2;
        }
        dp[1]=1;
        dp[2] = 2;
        for(int i=3;i<=n;i++) {
              dp[i] = dp[i-2]+2;
        }
        return dp[n];
    }
}
