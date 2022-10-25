package com.jchz.leetcode.simple.$面试题17_01_不用加号的加法;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-24 16:58
 */
public class Solution {
    public int add(int a, int b) {
        while (b != 0) {
            int t = a;
            a ^= b;
            b &= t;
            b <<= 1;
        }

        return a;
    }
}
