package com.jchz.leetcode.middle.$0474_一和零;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-25 18:54
 */
public class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int l = strs.length;
        int[][] dp = new int[m + 1][n + 1];

        for (int i = 1; i <= l; i++) {
            int[] zo = countZO(strs[i - 1]);
            for (int j = m; j >= 0; j--) {
                for (int k = n; k >= 0; k--) {
                    if (j >= zo[0] && k >= zo[1]) {
                        dp[j][k] = Math.max(dp[j][k], dp[j - zo[0]][k - zo[1]] + 1);
                    }
                }
            }
        }

        return dp[m][n];
    }

    private int[] countZO(String str) {
        int zcount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0')
                zcount++;
        }

        return new int[]{zcount, str.length() - zcount};
    }
}
