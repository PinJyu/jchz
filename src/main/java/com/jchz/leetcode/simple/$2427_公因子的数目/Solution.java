package com.jchz.leetcode.simple.$2427_公因子的数目;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 01:16
 * @see
 * @since
 */
public class Solution {
    public int commonFactors(int a, int b) {
        int gcd = gcd(a, b), count = 0;
        for (int i = 0; i <= gcd; i++) {
            if (gcd % i == 0)
                count++;
        }


        return count;
    }

    int gcd(int a, int b) {
        if (a > b)
            return gcd(b, a);

        while (a > 1) {
            int t = b % a;
            b = a;
            a = t;
        }

        return b;
    }

}
