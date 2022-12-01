package com.jchz.leetcode.simple.$面试题17_04_消失的数字;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 17:11
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        int sum = (1 + len) * len / 2;

        for (int i : nums) {
            sum -= i;
        }

        return sum;
    }
    public int missingNumber_1(int[] nums) {
        int checkSum = 0;
        for (int i : nums)
            checkSum ^= i;

        for (int i = 0; i <= nums.length; i++) {
            checkSum ^= i;
        }

        return checkSum;
    }
}
