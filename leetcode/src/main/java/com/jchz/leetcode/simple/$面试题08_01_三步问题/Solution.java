package com.jchz.leetcode.simple.$面试题08_01_三步问题;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 19:06
 * @see
 * @since
 */
public class Solution {

    public int waysToStep(int n) {
        long p = 0, q = 0, r = 1, m = 10000_00007;
        while (n-- > 0) {
            long t = (p + q + r) % m;
            p = q % m;
            q = r % m;
            r = t % m;
        }

        return (int )r;
    }

}
