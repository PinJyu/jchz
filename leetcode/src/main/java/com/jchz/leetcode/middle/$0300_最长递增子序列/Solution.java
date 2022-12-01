package com.jchz.leetcode.middle.$0300_最长递增子序列;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-10 19:45
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n + 1];
        dp[1] = nums[0];
        int len = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] > dp[len]) {
                len++;
                dp[len] = nums[i];
            }
            else {
                int l = 1, r = len, ans = 0;
                while (l <= r) {
                    int m = (r + l) >> 1;
                    if (dp[m] < nums[i]) {
                        ans = m;
                        l = m + 1;
                    }
                    else {
                        r = m - 1;
                    }
                }
                dp[ans + 1] = nums[i];
            }
        }

        // System.out.println(Arrays.toString(dp));
        return len;
    }
}
