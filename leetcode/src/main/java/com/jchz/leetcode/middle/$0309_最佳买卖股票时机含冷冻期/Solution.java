package com.jchz.leetcode.middle.$0309_最佳买卖股票时机含冷冻期;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-11 18:00
 */

public class Solution {
      public int maxProfit(int[] prices) {
        int n = prices.length;
        int p = -prices[0], q = 0, r = 0;
        for (int i = 1; i <= n; i++) {
            int p_ = Math.max(r - prices[i - 1], p);
            int q_ = p + prices[i - 1];
            int r_ = Math.max(q, r);
            p = p_;
            q = q_;
            r = r_;
        }

        return Math.max(q, r);
    }
}
