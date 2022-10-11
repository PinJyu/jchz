package com.jchz.leetcode.simple.$1920_基于排列构建数组;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 17:16
 */
public class Solution {
    public int[] buildArray(int[] nums) {
        int[] ret = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ret[i] = nums[nums[i]];
        }

        return ret;
    }
}
