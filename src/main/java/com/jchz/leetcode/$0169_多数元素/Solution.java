package com.jchz.leetcode.$0169_多数元素;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 00:55
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0, checkSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (checkSum == 0)
                candidate = nums[i];
            checkSum += candidate == nums[i] ? 1 : -1;
        }

        return candidate;
    }
}
