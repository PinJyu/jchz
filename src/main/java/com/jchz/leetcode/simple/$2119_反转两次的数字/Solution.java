package com.jchz.leetcode.simple.$2119_反转两次的数字;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-13 22:37
 * @see
 * @since
 */
public class Solution {
    public boolean isSameAfterReversals(int num) {
        return num % 10 != 0 || num == 0;
    }
}
