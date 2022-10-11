package com.jchz.leetcode.simple.$1974_使用特殊打字机键入单词的最少时间;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-11 20:30
 * @see
 * @since
 */
public class Solution {
    public int minTimeToType(String word) {
        char[] cs = word.toCharArray();
        char begin = 'a';
        int minutes = 0;
        for (char c : cs) {
            minutes += Math.min(Math.abs(c - begin), Math.abs(c + 26 - begin)) + 1;
            begin = c;

        }
        return minutes;
    }
}
