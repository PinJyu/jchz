package com.jchz.leetcode.simple.$1844_将所有数字用字符替换;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-10 22:17
 * @see
 * @since
 */
public class Solution {
    public String replaceDigits(String s) {
        char[] cs = s.toCharArray();
        for (int i = 1; i < cs.length; i += 2) {
            cs[i - 1] = shift(cs[i - 1], cs[i]- '0');
        }

        return new String(cs);
    }

    char shift(char a, int k) {
        return (char) (a + k);
    }
}
