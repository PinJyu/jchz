package com.jchz.leetcode.simple.$剑指OfferII0034_外星语言是否排序;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-22 17:19
 * @see
 * @since
 */
public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] map = new int[26];

        char[] cs = order.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            map[cs[i] - 'a'] = i;
        }

        for (int i = 0; i + 1 < words.length; i++) {
            char[] f = words[i].toCharArray(), s = words[i + 1].toCharArray();
            int len = Math.max(f.length, s.length);
            for (int j = 0; j < len; j++) {
                int a = j < f.length ? map[f[j] - 'a'] : -1;
                int b = j < s.length ? map[s[j] - 'a'] : -1;
                if (a < b)
                    break;
                else if (a > b)
                    return false;
            }
        }

        return true;
    }

}
