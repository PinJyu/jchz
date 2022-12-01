package com.jchz.leetcode.simple.$1848_到目标元素的最小距离;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-10 22:26
 * @see
 * @since
 */
public class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                int diff = i - start;
                if (diff >= 0)
                    return Math.min(diff, min);
                min = Math.min(min, Math.abs(diff));
            }
        }

        return min;
    }
}
