package com.jchz.leetcode.simple.$1800_最大升序子数组和;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-10 21:26
 * @see
 * @since
 */
public class Solution {
    public int maxAscendingSum(int[] nums) {

        int sum = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {

            if (sum == 0 || nums[i] > nums[i - 1]) {
                sum += nums[i];
                max = Math.max(sum, max);
            }
            else {
                sum = nums[i];
            }
        }

        return max;
    }
}
