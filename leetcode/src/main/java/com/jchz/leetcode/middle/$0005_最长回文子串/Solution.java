package com.jchz.leetcode.middle.$0005_最长回文子串;

import java.util.Arrays;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-08 12:16
 */
public class Solution {
    public String longestPalindrome(String s) {
        int n = s.length(), maxi = 1, maxj = 0;
        boolean[][] dp = new boolean[n + 1][n + 1];
        Arrays.fill(dp[1], true);
        Arrays.fill(dp[0], true);
        char[] cs = s.toCharArray();


        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
                // System.out.printf("%c, %c\n", cs[j], cs[j + i -1]);
                dp[i][j] = cs[j] == cs[j + i - 1] && dp[i - 2][j + 1];
                if (dp[i][j]) {
                    maxi = i;
                    maxj = j;
                }
            }
        }

// System.out.printf("%d, %d", maxj, maxi);
        return s.substring(maxj, maxj + maxi);
    }
}
