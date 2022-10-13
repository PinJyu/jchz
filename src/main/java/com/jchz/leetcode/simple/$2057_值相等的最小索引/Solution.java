package com.jchz.leetcode.simple.$2057_值相等的最小索引;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-12 21:08
 * @see
 * @since
 */
public class Solution {
    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i])
                return i;
        }

        return -1;
    }
}
