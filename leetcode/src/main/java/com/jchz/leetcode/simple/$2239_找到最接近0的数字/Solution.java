package com.jchz.leetcode.simple.$2239_找到最接近0的数字;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 16:26
 */
public class Solution {
    public int findClosestNumber(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i : nums) {
            if (Math.abs(i) < Math.abs(min)) {
                min = i;
            }
            else if (Math.abs(i) == Math.abs(min)) {
                min = Math.max(min, i);
            }
        }

        return min;
    }
}
