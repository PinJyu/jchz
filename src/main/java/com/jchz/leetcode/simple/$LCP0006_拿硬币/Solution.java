package com.jchz.leetcode.simple.$LCP0006_拿硬币;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 11:58
 * @see
 * @since
 */
public class Solution {
    public int minCount(int[] coins) {
        int count = 0;
        for (int i : coins) {
            count += i / 2 + i % 2;
        }

        return count;
    }

}
