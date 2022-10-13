package com.jchz.leetcode.simple.$2068_检查两个字符串是否几乎相等;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-12 22:19
 * @see
 * @since
 */
public class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        char[] cs1 = word1.toCharArray();
        char[] cs2 = word2.toCharArray();
        int[] map = new int[26];
        for (char c : cs1) {
            map[c - 'a']++;
        }
        for (char c : cs2) {
            map[c - 'a']--;
        }

        for (int i : map) {
            if (Math.abs(i) > 3)
                return false;
        }

        return true;
    }

}
