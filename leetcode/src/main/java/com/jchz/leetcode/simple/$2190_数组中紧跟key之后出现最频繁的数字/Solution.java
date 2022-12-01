package com.jchz.leetcode.simple.$2190_数组中紧跟key之后出现最频繁的数字;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 11:23
 */
public class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] map = new int[1001];
        int max = 0, maxValue = -1;
        for (int i = 0; i + 1< nums.length; i++) {
            if (nums[i] == key) {
                map[nums[i + 1]]++;
                if (map[nums[i + 1]] > max) {
                    max = map[nums[i + 1]];
                    maxValue = nums[i + 1];
                }
            }
        }

        return maxValue;
    }
}
