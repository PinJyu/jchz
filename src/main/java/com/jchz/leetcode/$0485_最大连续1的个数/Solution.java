package com.jchz.leetcode.$0485_最大连续1的个数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 16:22
 */
public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;

        for (int i = 0; i < nums.length; i++) {
            int j = nums[i];

            if (j == 1) {
                count++;
                if (count > max)
                    max = count;
            }
            else {
                count = 0;
            }
        }

        return max;
    }
}
