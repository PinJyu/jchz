package com.jchz.leetcode.simple.$0461_汉明距离;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 15:01
 */
public class Solution {

    public int hammingDistance(int x, int y) {
        int res = 0;
        x ^= y;
        while (x > 0) {
            x &= x - 1;
            res++;
        }

        return res;
    }
}
