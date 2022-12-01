package com.jchz.leetcode.simple.$2220_转换数字的最少位翻转次数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 14:36
 */
public class Solution {
    public int minBitFlips(int start, int goal) {
        int bitDiff = start ^ goal;
        int count = 0;
        while (bitDiff > 0) {
            bitDiff &= bitDiff - 1;
            count++;
        }

        return count;
    }
}
