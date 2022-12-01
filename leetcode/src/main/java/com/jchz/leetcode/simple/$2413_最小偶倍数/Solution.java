package com.jchz.leetcode.simple.$2413_最小偶倍数;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-15 23:20
 * @see
 * @since
 */
public class Solution {
    public int smallestEvenMultiple(int n) {
        return n % 2 == 0 ? n : n * 2;
    }

}
