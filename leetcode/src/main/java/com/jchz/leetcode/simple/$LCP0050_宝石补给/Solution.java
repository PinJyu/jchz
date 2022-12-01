package com.jchz.leetcode.simple.$LCP0050_宝石补给;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 19:28
 */
public class Solution {
    public int giveGem(int[] gem, int[][] operations) {
        for (int[] op : operations) {
            int c = gem[op[0]];
            gem[op[0]] -= c;
            gem[op[1]] += c;
        }

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i : gem) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        return max - min;
    }
}
