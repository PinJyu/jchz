package com.jchz.leetcode.simple.$2129_将标题首字母大写;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-13 22:44
 * @see
 * @since
 */
public class Solution {
    public String capitalizeTitle(String title) {
        char[] cs = title.toCharArray();
        StringBuilder sb = new StringBuilder();

        int start = 0;
        for (int i = 0; i < cs.length; i++) {
            if (i == 0 || cs[i - 1] == ' ')
                start = i;

            sb.append((char) (cs[i] | 32));
            if (i == cs.length - 1 || cs[i + 1] == ' ') {
                if (i - start + 1 > 2)
                    sb.setCharAt(start, (char) (sb.charAt(start) ^ 32));
            }
        }

        return sb.toString();
    }
}
