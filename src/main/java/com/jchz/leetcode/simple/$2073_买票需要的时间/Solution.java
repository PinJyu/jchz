package com.jchz.leetcode.simple.$2073_买票需要的时间;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-12 22:35
 * @see
 * @since
 */
public class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int sum = 0;
        int cycles = tickets[k];
        for (int i = 0; i < tickets.length; i++) {
            sum += Math.min(cycles, tickets[i]);
            if (i > k && tickets[i] >= cycles) {
                sum--;
            }
        }

        return sum;
    }
}

