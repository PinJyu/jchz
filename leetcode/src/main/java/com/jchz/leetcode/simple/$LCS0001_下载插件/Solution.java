package com.jchz.leetcode.simple.$LCS0001_下载插件;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 20:57
 */
public class Solution {
    public int leastMinutes_2(int n) {
        return (int) (Math.ceil(Math.log(n) / Math.log(2)) + 1);
    }

    public int leastMinutes_1(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            dp[i] = dp[(i + 1) / 2] + 1;
        }

        return dp[n];
    }



    int min = Integer.MAX_VALUE;
    public int leastMinutes(int n) {
        trace(1, 0, n, 0);

        return min;
    }

    void trace(int width, int down, int limit, int minutes) {
        if (down >= limit || width >= limit) {
            min = Math.min(minutes, min);
            return;
        }

        trace(width + 1, down, limit, minutes + 1);
        trace(width, width + down, limit, minutes + 1);
    }
}
