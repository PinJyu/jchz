package com.jchz.leetcode.middle.$0377_组合总和Ⅳ;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-24 20:33
 */
public class Solution {
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i >= nums[j]) {
                    dp[i] += dp[i - nums[j]];
                }
            }

            // for (int[] i : dp) {
            // for (int k : dp) {
            // System.out.print(k + "\t");
            // }
            // System.out.print("\n");
            // }
        }


        return dp[target];

    }
}
