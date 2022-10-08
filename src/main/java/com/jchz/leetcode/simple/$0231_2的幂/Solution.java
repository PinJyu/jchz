package com.jchz.leetcode.simple.$0231_2的幂;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-14 18:35
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        n = Math.abs(n);
        int l = 1;
        for (int i = 0; i < 32; i++) {
            if (l << i == n) {
                return true;
            }
        }

        return false;
    }


    public boolean isPowerOfTwo_1(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }

    public boolean isPowerOfTwo_2(int n) {
        return n > 0 &&(n & -n) == n;
    }

    public boolean isPowerOfTwo_3(int n) {
        final int BIGP2 = 1 << 30;
        return n > 0 && BIGP2 % n == 0;
    }
}
