package com.jchz.leetcode.simple.$面试题16_05_阶乘尾数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 11:37
 */
public class Solution {
    public int trailingZeroes(int n) {
        int c = 0;
        while (n > 0) {
            n /= 5;
            c += n;
        }


        return c;
    }
}
