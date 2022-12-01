package com.jchz.leetcode.simple.$0326_3的幂;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-16 15:03
 */
public class Solution {
    public boolean isPowerOfThree(int n) {
        if (n <= 1) return n == 1;
        return n % 3 == 0 && isPowerOfThree(n / 3);
    }
}
