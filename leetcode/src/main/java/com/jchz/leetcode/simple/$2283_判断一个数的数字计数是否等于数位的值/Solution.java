package com.jchz.leetcode.simple.$2283_判断一个数的数字计数是否等于数位的值;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 21:26
 * @see
 * @since
 */
public class Solution {
    public boolean digitCount(String num) {
        int[] map = new int[10];
        char[] cs = num.toCharArray();

        for (char c : cs) {
            map[c - '0']++;
        }

        for (int i = 0; i < cs.length; i++) {
            if (map[i] != cs[i] - '0')
                return false;
        }

        return true;

    }
}
