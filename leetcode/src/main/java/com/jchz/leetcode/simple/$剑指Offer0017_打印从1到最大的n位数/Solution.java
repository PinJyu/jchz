package com.jchz.leetcode.simple.$剑指Offer0017_打印从1到最大的n位数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-17 17:12
 */
public class Solution {
    public int[] printNumbers(int n) {
        int limit = 1;
        while (n-- > 0)
           limit *= 10;

        int[] ret = new int[limit - 1];
        for (int i = 1; i < limit; i++) {
            ret[i - 1] = i;
        }

        return ret;
    }
}
