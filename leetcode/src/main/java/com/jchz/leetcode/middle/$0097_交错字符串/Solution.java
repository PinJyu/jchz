package com.jchz.leetcode.middle.$0097_交错字符串;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-08 17:57
 */
public class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length())
            return false;


        boolean[][] dp = new boolean[s1.length() + 1][s2.length() + 1];
        dp[0][0] = true;

        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                int p = i + j - 1;
                if (i > 0) {
                    dp[i][j] |= dp[i - 1][j] && s1.charAt(i - 1) == s3.charAt(p);
                }
                if (j > 0) {
                    dp[i][j] |= dp[i][j - 1] && s2.charAt(j - 1) == s3.charAt(p);
                }
            }
        }

        return dp[s1.length()][s2.length()];
    }
}
