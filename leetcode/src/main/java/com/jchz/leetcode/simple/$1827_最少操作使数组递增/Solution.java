package com.jchz.leetcode.simple.$1827_最少操作使数组递增;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-10 22:04
 * @see
 * @since
 */
public class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            int diff = nums[i - 1] + 1 - nums[i];
            if (diff > 0) {
                nums[i] += diff;
                count += diff;
            }
        }

        return count;
    }
}
