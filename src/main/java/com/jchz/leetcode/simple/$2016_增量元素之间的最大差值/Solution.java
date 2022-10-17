package com.jchz.leetcode.simple.$2016_增量元素之间的最大差值;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-12 16:37
 */
public class Solution {
    public int maximumDifference(int[] nums) {
        int max = -1, maxStage = 0;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] >= maxStage) {
                maxStage = nums[i];
            }
            else {
                max = Math.max(max, maxStage - nums[i]);
            }
        }

        return max;
    }
}
