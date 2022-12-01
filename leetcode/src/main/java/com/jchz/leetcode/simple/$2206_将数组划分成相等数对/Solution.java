package com.jchz.leetcode.simple.$2206_将数组划分成相等数对;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 12:00
 */
public class Solution {
    public boolean divideArray(int[] nums) {
        int[] map = new int[501];
        for (int i : nums) {
            map[i]++;
        }

        for (int i : map) {
            if ((i & 1) == 1)
                return false;
        }

        return true;
    }

}
