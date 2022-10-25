package com.jchz.leetcode.simple.$剑指OfferII0088_爬楼梯的最少成本;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 14:25
 * @see
 * @since
 */
public class Solution {

    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length + 1];
        return down(cost, cost.length + 1);
    }

    int down(int[] cost, int floor) {
        if (floor < 2)
            return 0;
        if (dp[floor] == 0)
            dp[floor] = Math.min(down(cost, floor - 1) + cost[floor - 1], down(cost, floor - 2) + cost[floor - 2]);

        return dp[floor];
    }

    public int minCostClimbingStairs_1(int[] cost) {
        int p = 0, q = 0;
        for (int i = 2; i < cost.length + 1; i++) {
            int t = Math.min(p + cost[i - 2], q + cost[i - 1]);
            p = q;
            q = t;
        }

        return q;
    }

}
