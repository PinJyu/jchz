package com.jchz.leetcode.middle.$0473_火柴拼正方形;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-25 14:35
 */
public class Solution {
    public boolean makesquare(int[] matchsticks) {
        int n;
        if ((n = matchsticks.length) < 4)
            return false;
        int sum = Arrays.stream(matchsticks).sum();

        if (sum % 4 != 0)
            return false;

        int len = sum / 4;
        int[] dp = new int[1 << n];
        Arrays.fill(dp, -1);
        dp[0] = 0;
        for (int s = 1; s < (1 << n); s++) {
            for (int i = 0; i < matchsticks.length; i++) {
                if ((s & (1 << i)) == 0)
                    continue;

                int s1 = s & ~(1 << i);
                if (dp[s1] >= 0 && dp[s1] + matchsticks[i] <= len) {
                    dp[s] = (dp[s1] + matchsticks[i]) % len;
                    break;
                }
            }
        }

        return dp[(1 << n) - 1] ==0 ;
    }
}
