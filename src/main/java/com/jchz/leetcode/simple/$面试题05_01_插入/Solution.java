package com.jchz.leetcode.simple.$面试题05_01_插入;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 18:01
 * @see
 * @since
 */
public class Solution {
    public int insertBits(int N, int M, int i, int j) {
        M <<= i;

        int mask = ~(((1 << j << 1) - 1) ^ ((1 << i) - 1));

        System.out.println(Integer.toBinaryString(M));
        System.out.println(Integer.toBinaryString(N));
        System.out.println(Integer.toBinaryString(mask));
        return N & mask | M;
    }

}
