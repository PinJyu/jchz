package com.jchz.leetcode.$1486_数组异或操作;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 21:09
 * @see
 * @since
 */
public class Solution {
    public int xorOperation(int n, int start) {
        int ret = 0;
        for (int i = 0; i < n; i++) {
            ret ^= start + 2 * i;
        }

        return ret;
    }
}
