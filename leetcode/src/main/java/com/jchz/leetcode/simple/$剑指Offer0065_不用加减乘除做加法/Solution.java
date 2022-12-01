package com.jchz.leetcode.simple.$剑指Offer0065_不用加减乘除做加法;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-20 17:05
 */
public class Solution {
    public int add(int a, int b) {
        int carry = (a & b) << 1, sum = a ^ b;
        while (carry != 0) {
            int t = sum;
            sum = carry ^ sum;
            carry = (carry & t) << 1;

        }

        return carry | sum;
    }
}
