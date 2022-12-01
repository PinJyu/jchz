package com.jchz.leetcode.simple.$LCP0022_黑白方格画;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 14:24
 * @see
 * @since
 */
public class Solution {
    public int paintingPlan(int n, int k) {
        if (k == 0) return 1;
        if (k == n * n) return 1;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int c = i * n + j * n - i * j;
                if (c > k)
                    break;
                else if (c == k) {
                    count += stage(n, i) * stage(n, j);
                }
            }
        }


        return count;
    }

    int stage(int n, int k) {
        int s = 1, ks = 1, ds = 1;
        for (int i = 1; i <= n; i++) {
            s *= i;
            if (i == k)
                ks = s;
            if (i == n - k)
                ds = s;
        }

        return s / ks / ds;
    }
}
