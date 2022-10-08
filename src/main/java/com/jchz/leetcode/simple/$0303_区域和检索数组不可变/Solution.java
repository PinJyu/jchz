package com.jchz.leetcode.simple.$0303_区域和检索数组不可变;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-16 14:47
 */
public class Solution {
    class NumArray {

        private int[] sums;
        public NumArray(int[] nums) {
            sums = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                sums[i + 1] = nums[i] + sums[i];

            }
        }

        public int sumRange(int left, int right) {

            return sums[right + 1] - sums[left];
        }
    }
}
