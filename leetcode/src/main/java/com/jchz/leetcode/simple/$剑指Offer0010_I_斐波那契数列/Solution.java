package com.jchz.leetcode.simple.$剑指Offer0010_I_斐波那契数列;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-17 11:41
 */
public class Solution {

    public int fib_2(int n) {
        if (n < 2)
            return n == 1 ? 1 : 0;

        n--;

        return matixN(n)[0][0];
    }

    int[][] matixN(int n) {
        int[][] m1 = {{1, 1}, {1, 0}};
        int[][] ret = {{1, 0}, {0, 1}};


        while (n > 0) {
            if ((n & 1) == 1) {
                ret = matixProduct(ret, m1);
            }
            m1 = matixProduct(m1, m1);
            n >>= 1;
        }

        return ret;
    }

    int[][] matixProduct(int[][] matix1, int[][] matix2) {
        int row1 = matix1.length, col1 = matix1[0].length;
        int row2 = matix2.length, col2 = matix2[0].length;
        int[][] product = new int[row1][col2];

        final int dived = 10000_00007;
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                product[i][j] = (int) (((long) matix1[i][0] * matix2[0][j] + (long) matix1[i][1] * matix2[1][j]) % dived);
            }
        }

        return product;
    }


    int[] dp = new int[100];
    public int fib_1(int n) {
        if (n < 2)
            return n == 1 ? 1 : 0;

        if (dp[n] != 0)
            return dp[n];

        final int dived = 10000_00007;
        dp[n] = (fib(n - 1) % dived + fib(n - 2) % dived) % dived;
        return dp[n];
    }

    public int fib(int n) {
        if (n < 2)
            return n == 1 ? 1 : 0;

        final int dived = 10000_00007;
        int p = 0, q = 1;
        while (n-- > 2) {
            int t = p + q;
            p = q % dived;
            q = t % dived;
        }

        return q ;
    }



}
