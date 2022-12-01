package com.jchz.leetcode.simple.$1652_拆炸弹;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-09 22:35
 * @see
 * @since
 */
public class Solution {
    public int[] decrypt(int[] code, int k) {
        int[] ret = new int[code.length];
        for (int i = 0; i < code.length; i++) {
            int sum = 0;
            for (int j = 1; j <= Math.abs(k); j++) {
                sum += code[((k > 0 ? j : -j) + i + code.length) % code.length];
            }
            ret[i] = sum;
        }

        return ret;
    }
}
