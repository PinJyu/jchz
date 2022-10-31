package com.jchz.leetcode.middle.$0122_买卖股票的最佳时机II;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-31 20:56
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int sum = 0;
        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - prices[i - 1];
            sum += Math.max(profit, 0);
        }

        return sum;

    }
}
