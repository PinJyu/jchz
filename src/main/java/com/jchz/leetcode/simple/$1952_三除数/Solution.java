package com.jchz.leetcode.simple.$1952_三除数;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-11 17:58
 */
public class Solution {
    public boolean isThree(int n) {
        return countGcd(n) == 3;
    }

    int countGcd(int n) {
        int count = 2;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                count += n / i == i ? 1 : 2;
            }
        }

        return count;
    }
}
