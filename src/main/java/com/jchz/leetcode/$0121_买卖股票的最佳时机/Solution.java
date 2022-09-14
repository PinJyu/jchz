package com.jchz.leetcode.$0121_买卖股票的最佳时机;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-13 11:55
 */
public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;

        int sumprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            int profit = prices[i + 1] - prices[i];
            sumprofit += profit;
            if (sumprofit < 0)
                sumprofit = 0;

            max = Math.max(sumprofit, max);

        }

        return max;
    }

    // 寻找最小值
    public int maxProfit_1(int[] prices) {
        int max = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }
            else if (prices[i] - minPrice > max) {
                max = prices[i] - minPrice;
            }
        }

        return max;
    }


    public int maxProfit_2(int[] prices) {
        int max = 0;

        int sumprofit = 0;
        int cur = 0;
        if (prices.length > 1)
            cur = prices[0];

        for (int i = 0; i < prices.length - 1; i++) {
            int profit = prices[i + 1] - cur;
            cur = prices[i + 1];
            sumprofit += profit;
            if (sumprofit < 0)
                sumprofit = 0;

            max = Math.max(sumprofit, max);

        }

        return max;
    }
}
