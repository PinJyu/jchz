package com.jchz.leetcode.middle.$0198_打家劫舍;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-01 18:14
 */
public class Solution {
    public int rob(int[] nums) {
        int p = 0, q = 0, r = 0, max = 0;
        for (int i = 0; i < nums.length; i++) {
            int t = r;
            nums[i] = nums[i] + Math.max(p, q);
            r = nums[i];
            p = q;
            q = t;
            max = Math.max(nums[i], max);
        }

        return max;
    }
}
