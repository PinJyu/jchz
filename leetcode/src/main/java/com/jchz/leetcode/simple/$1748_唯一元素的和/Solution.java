package com.jchz.leetcode.simple.$1748_唯一元素的和;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 16:38
 */
public class Solution {
    public int sumOfUnique(int[] nums) {
        int[] map = new int[101];
        for (int num : nums) {
            map[num]++;
        }

        int sum = 0;
        for (int i = 0; i < map.length; i++) {
            sum += map[i] == 1 ? i : 0;
        }

        return sum;
    }
}
