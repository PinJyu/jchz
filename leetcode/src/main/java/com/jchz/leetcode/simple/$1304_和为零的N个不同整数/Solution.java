package com.jchz.leetcode.simple.$1304_和为零的N个不同整数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 19:52
 */
public class Solution {
    public int[] sumZero(int n) {
        int[] res = new int[n];
        int index = 0;
        for (int i = 0; i < n / 2; i++) {
            res[index++] = i + 1;
            res[index++] = -(i + 1);
        }

        return res;
    }
}
