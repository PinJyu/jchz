package com.jchz.leetcode.$1475_商品折扣后的最终价格;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-01 17:49
 */
class Solution {

    public int[] finalPrices(int[] prices) {
        if (prices == null) return null;
        if (prices.length == 0) return prices;

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            int next = i + 1;
            for (int j = next; j < prices.length; j++) {
                int price_ = prices[j];
                if (price_ <= price) {
                    prices[i] = price - price_;
                    break;
                }
            }
        }

        return prices;
    }

    // 单调栈
    public int[] finalPrices2(int[] prices) {
        if (prices == null) return null;
        if (prices.length == 0) return prices;

        int[] ans = new int[prices.length];

        Deque<Integer> indexStack = new ArrayDeque<>();

        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            while (!indexStack.isEmpty() && price <= prices[indexStack.peekLast()]) {
                int index = indexStack.pollLast();
                ans[index] = prices[index] - price;
            }
            indexStack.addLast(i);
            ans[i] = price;
        }

        return ans;
    }
}