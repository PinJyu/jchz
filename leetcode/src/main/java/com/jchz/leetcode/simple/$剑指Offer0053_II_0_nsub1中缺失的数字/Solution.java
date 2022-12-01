package com.jchz.leetcode.simple.$剑指Offer0053_II_0_nsub1中缺失的数字;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-19 17:52
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int l = 0, r = nums.length - 1;
        if (nums[r - 1] == r)
            return r + 1;

        while (l < r) {
            int mid = (l + r) / 2;
            if (nums[mid] > mid) {
                r = mid;
            }
            else {
                l = mid + 1;
            }
        }

        return l;
    }
}
