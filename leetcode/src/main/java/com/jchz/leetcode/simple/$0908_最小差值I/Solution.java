package com.jchz.leetcode.simple.$0908_最小差值I;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 15:31
 */
public class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i : nums) {
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        return Math.max(max - min - 2 * k, 0);
    }
}
