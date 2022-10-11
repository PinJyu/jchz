package com.jchz.leetcode.simple.$1984_学生分数的最小差值;

import java.util.Arrays;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-11 20:51
 * @see
 * @since
 */
public class Solution {
    public int minimumDifference(int[] nums, int k) {
        if (k == 1) return 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for (int i = k - 1; i < nums.length; i++) {
            min = Math.min(min, Math.abs(nums[i] - nums[i - k + 1]));
        }

        return min;
    }

}
