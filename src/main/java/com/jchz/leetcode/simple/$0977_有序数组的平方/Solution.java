package com.jchz.leetcode.simple.$0977_有序数组的平方;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-03 21:45
 */
public class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0, r = nums.length - 1, pos = nums.length - 1;

        int[] ans = new int[nums.length];
        while (l <= r) {
            if (Math.abs(nums[r]) >= Math.abs(nums[l])) {
                ans[pos] = nums[r] * nums[r];
                r--;
            }
            else {
                ans[pos] = nums[l] * nums[l];
                l++;
            }
            pos--;
        }

        return ans;
    }
}
