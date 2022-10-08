package com.jchz.leetcode.simple.$1317_将整数转换为两个无零整数的和;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-06 20:17
 */
public class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 0; i < n / 2 + 1; i++) {
            if (!containZero(i) && !containZero(n - i))
                return new int[]{i, n - i};
        }

        return null;
    }

    boolean containZero(int i) {
        if (i == 0) return true;
        while (i > 0) {
            int mode = i % 10;
            i /= 10;
            if (mode == 0)
                return true;
        }

        return false;
    }
}
