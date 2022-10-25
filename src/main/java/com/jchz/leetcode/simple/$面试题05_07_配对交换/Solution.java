package com.jchz.leetcode.simple.$面试题05_07_配对交换;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-23 19:03
 * @see
 * @since
 */
public class Solution {
    public int exchangeBits(int num) {
        return ((num >> 1) & 0x55555555) | ((num << 1) & 0xaaaaaaaa);
    }

}
