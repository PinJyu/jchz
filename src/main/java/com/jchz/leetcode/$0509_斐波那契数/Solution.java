package com.jchz.leetcode.$0509_斐波那契数;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-21 15:05
 */
public class Solution {
    public static void main(String[] args) {
        new Solution().fib(4);
    }


    private Integer[] list;
    // dp
    public int fib_1(int n) {
        if (list == null)
            list = new Integer[n + 1];

        return dp(n);
    }

    public int dp(int n) {
        if (n <= 1) return n;
        if (list[n] != null) return list[n];
        return fib(n - 1) + fib(n - 2);
    }
    // 循环数组
    public int fib(int n) {
        int p = 0, q = 1, r = 1;
        if (n == 0) return p;
        if (n == 1) return 1;

        for (int i = 2; i <= n; i++) {
            r = p + q;
            p = q;
            q = r;
            System.out.printf("%d, %d, %d%n", p, q, r);
        }

        return r;
    }
}
