package com.jchz.leetcode.simple.$1413_逐步求和得到正数的最小值;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 18:19
 * @see
 * @since
 */
public class Solution {
    public int minStartValue(int[] nums) {
        int sum = 0, min = Integer.MAX_VALUE;

        for (int i : nums) {
            sum += i;
            min = Math.min(min, sum);
        }

        return min < 1 ? 1 - min : 1;
    }
}
