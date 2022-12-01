package com.jchz.leetcode.middle.$0153_寻找旋转排序数组中的最小值;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-01 16:30
 */
public class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] < nums[r])
                r = m;
            else
                l = m + 1;
        }

        return nums[r];
    }
}
