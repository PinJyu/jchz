package com.jchz.leetcode.simple.$面试题17_10_主要元素;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 17:28
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = -1;
        for (int i : nums) {
            if (count == 0) {
                candidate = i;
            }

            if (i == candidate)
                count++;
            else
                count--;
        }

        count = 0;
        for (int i : nums) {
            if (i == candidate)
                count++;
        }

        return count > nums.length / 2 ? candidate : -1;
    }
}
