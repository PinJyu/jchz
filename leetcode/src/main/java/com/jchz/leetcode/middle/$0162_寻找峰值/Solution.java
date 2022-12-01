package com.jchz.leetcode.middle.$0162_寻找峰值;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-01 16:51
 */
public class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            int m = (r + l) / 2;
            if (nums[m] < nums[m + 1]) {
                l = m + 1;
            }
            else
                r = m;
        }

        return l;
    }
}
