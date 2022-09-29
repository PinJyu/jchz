package com.jchz.leetcode.$0724_寻找数组的中心下标;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-27 18:36
 */
public class Solution {
    public int pivotIndex_1(int[] nums) {
        int sum = 0, total = Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++) {
            if (sum * 2 + nums[i] == total)
                return i;

            sum += nums[i];
        }

        return -1;
    }

    public int pivotIndex(int[] nums) {
        int l = 0, r = nums.length - 1;
        if (nums.length == 1) return 0;

        int sumR = sum(nums, l, r), sumL = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i - 1 < 0)
                sumL = 0;
            else
                sumL += nums[i - 1];

            if (i + 1 == nums.length)
                sumR = 0;
            else
                sumR -= nums[i];

            if (sumL == sumR)
                return i;
        }

        return -1;
    }

    private int sum(int[] nums, int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += nums[i];
        }

        return sum;
    }
}
