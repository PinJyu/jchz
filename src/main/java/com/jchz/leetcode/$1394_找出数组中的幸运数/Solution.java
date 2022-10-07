package com.jchz.leetcode.$1394_找出数组中的幸运数;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 17:02
 * @see
 * @since
 */
public class Solution {
    public int findLucky(int[] arr) {
        int[] counts = new int[501];
        for (int i : arr) {
            counts[i]++;
        }

        for (int i = counts.length - 1; i > 0; i--) {
            if (counts[i] == i) {
                return i;
            }
        }

        return -1;
    }
}
