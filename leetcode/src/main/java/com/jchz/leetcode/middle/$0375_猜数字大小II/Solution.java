package com.jchz.leetcode.middle.$0375_猜数字大小II;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-11-24 19:19
 */
public class Solution {
    public int getMoneyAmount(int n) {
        int[][] dp = new int[n + 2][n + 2];

        for (int l = 2; l <= n; l++) {
            for (int i = 1; i + l - 1 <= n; i++) {
                int j = i + l - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k <= j ; k++) {
                    dp[i][j] = Math.min(dp[i][j], k + Math.max(dp[i][k - 1], dp[k + 1][j]));
                }
            }
        }

        // for (int[] i : dp) {
        //     for (int j : i) {
        //         System.out.print(j + "\t");
        //     }
        //     System.out.print("\n");
        // }
        return dp[1][n];
    }
}
