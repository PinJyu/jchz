package com.jchz.leetcode.simple.$1672_最富有客户的资产总量;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-09 23:49
 * @see
 * @since
 */
public class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }

            max = Math.max(max, sum);
        }

        return max;
    }
}
