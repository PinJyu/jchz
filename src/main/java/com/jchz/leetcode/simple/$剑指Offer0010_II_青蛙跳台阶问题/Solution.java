package com.jchz.leetcode.simple.$剑指Offer0010_II_青蛙跳台阶问题;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-17 15:30
 */
public class Solution {
    int[] dp = new int[1001];

    public int numWays(int n) {
        if (n < 2)
            return 1;

        if (dp[n] == 0)
            dp[n] = numWays(n - 1) + numWays(n - 2);

        return dp[n];
    }

    public int numWays_1(int n) {

        long p = 1, q = 1;
        while (n-- > 1) {
            long r = p + q;
            p = q;
            q = r;
        }

        return (int) (q % 10000_00007);
    }
}

