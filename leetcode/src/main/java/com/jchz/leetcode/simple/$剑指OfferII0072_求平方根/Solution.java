package com.jchz.leetcode.simple.$剑指OfferII0072_求平方根;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-22 20:48
 * @see
 * @since
 */
public class Solution {
    public int mySqrt(int x) {
        long l = 0, r = x, ans = 0;
        while (l <= r) {
            long m = (r - l) / 2 + l;
            if (m * m <= x) {
                ans = m;
                l = m + 1;
            }
            else {
                r = m - 1;
            }
        }

        return (int) ans;
    }
}
