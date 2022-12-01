package com.jchz.leetcode.simple.$剑指OfferII0012_左右两边子数组的和相等;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-21 17:05
 */
public class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int i : nums)
            sum += i;

        int l = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum - nums[i] == 2 * l)
                return i;
            l += nums[i];
        }

        return -1;
    }
}
