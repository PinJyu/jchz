package com.jchz.leetcode.simple.$剑指Offer0015_二进制中1的个数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-17 16:19
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int c = 0;
        while (n != 0) {
            c++;
            n &= (n - 1);
        }

        return c;
    }

    public int hammingWeight_1(int n) {
        n = ((n >> 1) & 0x55555555) + (n & 0x55555555);
        n = ((n >> 2) & 0x33333333) + (n & 0x33333333);
        n = ((n >> 4) & 0x0f0f0f0f) + (n & 0x0f0f0f0f);
        n = ((n >> 8) & 0x00ff00ff) + (n & 0x00ff00ff);
        n = ((n >> 16) & 0x0000ffff) + (n & 0x0000ffff);

        return n;
    }

    public int hammingWeight_2(int n) {
        n = n - ((n >>> 1) & 0x55555555); // 11 -> 10 10 -> 01 01 -> 01 00 -> 00
        n = ((n >>> 2) & 0x33333333) + (n & 0x33333333); // 1010 -> 0100
        n = (n + (n >>> 4)) & 0x0f0f0f0f; // low4bit
        n = n + (n >>> 8); // low6bit, ignorehigh
        n = n + (n >>> 16);

        return n & 0x3f; // low6bit;
    }
}
