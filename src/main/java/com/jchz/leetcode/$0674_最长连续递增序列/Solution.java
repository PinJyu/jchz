package com.jchz.leetcode.$0674_最长连续递增序列;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-26 18:05
 */
public class Solution {
    public int findLengthOfLCIS(int[] nums) {

        int len = nums.length;
        int max = 1;
        int res = 1;
        for (int i = 1; i < len; i++) {
            if (nums[i] > nums[i - 1]) {
                res++;
                max = Math.max(max, res);
            }
            else {
                res = 1;
            }
        }


        return max;
    }
}
