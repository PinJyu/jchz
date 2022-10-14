package com.jchz.leetcode.simple.$2341_数组能形成多少数对;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 23:16
 * @see
 * @since
 */
public class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] map = new int[101];
        int count = 0, rest = 0;
        for (int i : nums) {
            map[i]++;
        }

        for (int j : map) {
            if (j != 0) {
                count += j / 2;
                rest += j % 2;
            }
        }


        return new int[]{count, rest};
    }
}
