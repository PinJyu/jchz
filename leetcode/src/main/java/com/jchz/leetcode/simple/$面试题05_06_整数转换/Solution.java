package com.jchz.leetcode.simple.$面试题05_06_整数转换;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 18:55
 * @see
 * @since
 */
public class Solution {

    public int convertInteger(int A, int B) {
        return bitCounts(A ^ B);
    }

    int bitCounts(int n) {
        n = n - ((n >> 1) & 0x55555555);
        n = (n & 0x33333333) + ((n >> 2) & 0x33333333);
        n = (n + (n >> 4)) & 0x0f0f0f0f;
        n =  n + (n >> 8);
        n =  n + (n >> 16);

        return n & 0x3f;
    }

}
