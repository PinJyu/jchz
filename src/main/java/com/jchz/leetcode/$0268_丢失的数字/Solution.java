package com.jchz.leetcode.$0268_丢失的数字;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-16 11:17
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int max = nums.length;
        int sum = (int) (max * (max + 1) / (double) 2);

        for (int i = 0; i < nums.length; i++) {
            sum -= nums[i];
        }

        return sum;
    }


}
