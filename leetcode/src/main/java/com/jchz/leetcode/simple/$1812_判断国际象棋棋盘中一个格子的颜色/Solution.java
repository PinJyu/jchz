package com.jchz.leetcode.simple.$1812_判断国际象棋棋盘中一个格子的颜色;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-10 21:46
 * @see
 * @since
 */
public class Solution {
    public boolean squareIsWhite(String coordinates) {
        char[] cs = coordinates.toCharArray();
        int c = cs[0] - 'a', r = cs[1];

        return c % 2 == r % 2;
    }
}
