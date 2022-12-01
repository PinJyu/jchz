package com.jchz.leetcode.simple.$0746_使用最小花费爬楼梯;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-28 15:38
 */
public class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] minCost = new int[cost.length];
        for (int i = 0; i < cost.length; i++) {
            if (i < 2) {
                minCost[i] = cost[i];
            }
            else {
                minCost[i] = Math.min(minCost[i - 1], minCost[i - 2]) + cost[i];
            }
        }

        return Math.min(minCost[minCost.length - 1], minCost[minCost.length - 2]);
    }

}
