package com.jchz.leetcode.$0762_二进制表示中质数个计算置位;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-28 17:04
 */
public class Solution {

    public int countPrimeSetBits(int left, int right) {
        int c = 0;

        for (int i = left; i <= right; i++) {
            int cbs = Integer.bitCount(i);
            if (isPrimeNumber(cbs))
                c++;
        }

        return c;
    }

    private int countBitSets(int v) {
        int count = 0;
        while (v > 0) {
            v = v & (v - 1);
            count++;
        }

        return count;
    }

    private boolean isPrimeNumber(int v) {
        int sqrt = (int) Math.sqrt(v);
        if (sqrt * sqrt == v)
            return false;

        for (int i = 2; i < sqrt; i++) {
            if (v % i == 0)
                return false;
        }

        return true;
    }
}
