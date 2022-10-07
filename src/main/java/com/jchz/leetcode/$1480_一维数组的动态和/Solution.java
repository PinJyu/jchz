package com.jchz.leetcode.$1480_一维数组的动态和;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 20:54
 * @see
 * @since
 */
public class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] += sum;
            sum = nums[i];
        }

        return nums;
    }
}
