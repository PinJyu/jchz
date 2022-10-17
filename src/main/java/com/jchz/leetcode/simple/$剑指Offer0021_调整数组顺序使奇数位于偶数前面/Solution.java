package com.jchz.leetcode.simple.$剑指Offer0021_调整数组顺序使奇数位于偶数前面;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-17 17:34
 */
public class Solution {
    public int[] exchange(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {
            if (nums[l] % 2 == 0) {
                int t = nums[r];
                nums[r] = nums[l];
                nums[l] = t;
                r--;
            }
            else
                l++;
        }

        return nums;
    }
}
