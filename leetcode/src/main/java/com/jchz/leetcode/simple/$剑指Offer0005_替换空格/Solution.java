package com.jchz.leetcode.simple.$剑指Offer0005_替换空格;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-16 17:00
 * @see
 * @since
 */
public class Solution {
    public String replaceSpace(String s) {
        char[] cs = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : cs) {
            if (c == ' ')
                sb.append('%').append('2').append('0');
            else
                sb.append(c);
        }

        return sb.toString();
    }

}
