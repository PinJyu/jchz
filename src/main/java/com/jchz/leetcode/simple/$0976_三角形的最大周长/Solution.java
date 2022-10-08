package com.jchz.leetcode.simple.$0976_三角形的最大周长;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 21:35
 */
public class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if (nums[i] <= nums[i - 1] * 2 && nums[i] < nums[i - 1] + nums[i - 2]) {
                return nums[i] + nums[i - 1] + nums[i - 2];
            }
        }

        return 0;
    }
}
