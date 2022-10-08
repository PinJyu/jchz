package com.jchz.leetcode.simple.$1137_第N个泰波那契数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 20:49
 */
public class Solution {
    public int tribonacci(int n) {
        if (n < 3) {
            return new int[]{0, 1, 1}[n];
        }

        int p = 0, q = 1, r = 1;

        while (n > 2) {
            int t = r;
            r = p + q + r;
            p = q;
            q = t;
            n--;
        }

        return r;
    }
}
