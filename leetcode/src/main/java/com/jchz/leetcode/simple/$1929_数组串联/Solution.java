package com.jchz.leetcode.simple.$1929_数组串联;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 17:35
 */
public class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ret = new int[nums.length << 1];
        System.arraycopy(nums, 0, ret, 0, nums.length);
        System.arraycopy(nums, 0, ret, nums.length, nums.length);

        return ret;
    }
}
