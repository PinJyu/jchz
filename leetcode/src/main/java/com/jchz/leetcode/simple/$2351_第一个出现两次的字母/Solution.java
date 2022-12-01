package com.jchz.leetcode.simple.$2351_第一个出现两次的字母;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-14 23:29
 * @see
 * @since
 */
public class Solution {
    public char repeatedCharacter(String s) {
        int[] map = new int[26];
        for (char c : s.toCharArray()) {
            map[c - 'a']++;

            if (map[c - 'a'] == 2)
                return c;
        }

        return ' ';
    }

}
