package com.jchz.leetcode.$1175_质数排列;

import jdk.nashorn.internal.ir.SplitReturn;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-05 21:43
 */
public class Solution {
    public static void main(String[] args) {
        int i = new Solution().numPrimeArrangements(100);
    }
    public int numPrimeArrangements(int n) {
        int primeCount = 0;

    outter:
        for (int i = 2; i < n + 1; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0)
                    continue outter;
            }
            primeCount++;
        }

        return (int) (stage(primeCount)  * stage(n - primeCount) % (1000_0000_07));
    }


    long stage(int n) {
        long ret = 1;
        while (n > 0) {
            ret = (long) ((ret * n) % (1000_0000_07));
            n--;
        }

        return ret;
    }
}
