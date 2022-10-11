package com.jchz.leetcode.simple.$1979_找出数组的最大公约数;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-11 20:38
 * @see
 * @since
 */
public class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return gcd(max, min);
    }

    int gcd(int x, int y) {
        return x == 0 ? y : gcd(y % x, x);
    }
}
