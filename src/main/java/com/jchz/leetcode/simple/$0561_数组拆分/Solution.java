package com.jchz.leetcode.simple.$0561_数组拆分;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-23 12:02
 */
public class Solution {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minIndex = j;
                }
            }

            int t = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = t;

            if (i % 2 == 0)
                sum += nums[i];
        }

        return sum;
    }
}
