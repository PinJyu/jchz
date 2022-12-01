package com.jchz.leetcode.simple.$2309_兼具大小写的最好英文字母;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 22:14
 * @see
 * @since
 */
public class Solution {
    public String greatestLetter(String s) {
        char[] cs = s.toCharArray();
        int[] map = new int[26];
        for (char c : cs) {
            int bit = c < (c | 32) ? 1 : 2;
            map[(c | 32) - 'a'] |= bit;
        }

        for (int i = map.length - 1; i >= 0; i--) {
            if (map[i] == 3)
                return String.valueOf((char) ((i + 'a') ^ 32));
        }

        return "";
    }

}
