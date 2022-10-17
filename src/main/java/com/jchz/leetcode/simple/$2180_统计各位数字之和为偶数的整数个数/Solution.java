package com.jchz.leetcode.simple.$2180_统计各位数字之和为偶数的整数个数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 11:11
 */
public class Solution {
    public int countEven(int num) {
        int sum = 0;
        for (int i = 2; i <= num; i++) {
            sum += radixSum(i) % 2 == 0 ? 1 : 0;
        }

        return sum;
    }

    int radixSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
