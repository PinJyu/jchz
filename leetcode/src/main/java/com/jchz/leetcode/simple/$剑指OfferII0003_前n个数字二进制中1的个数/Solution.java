package com.jchz.leetcode.simple.$剑指OfferII0003_前n个数字二进制中1的个数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-21 15:57
 */
public class Solution {
    public int[] countBits_4(int n) {
        int[] ret = new int[n + 1];
        for (int i = 1; i < ret.length; i++) {
            ret[i] = ret[i & (i - 1)] + 1;
        }

        return ret;
    }

    public int[] countBits_3(int n) {
        int[] ret = new int[n + 1];
        for (int i = 1; i < ret.length; i++) {
            ret[i] = ret[i >> 1] + (i & 1);
        }

        return ret;
    }

    public int[] countBits_2(int n) {
        int[] ret = new int[n + 1];
        int highest = 0;
        for (int i = 1; i < ret.length; i++) {
            if ((i & (i - 1)) == 0)
                highest = i;
            ret[i] = ret[i - highest];
        }

        return ret;
    }

    public int[] countBits_1(int n) {
        int[] ret = new int[n + 1];
        for (int i = 1; i < ret.length; i++) {
            ret[i] = bitCounts(i);
        }

        return ret;
    }

    int bitCounts(int n) {
        n = n - ((n >> 1) & 0x55555555);
        n = ((n >> 2) & 0x33333333) + (n & 0x33333333);
        n = (n + (n >> 4)) & 0x0f0f0f0f;
        n = n + (n >> 8);
        n = n + (n >> 16);
        return n & 0x3f;
    }

}
