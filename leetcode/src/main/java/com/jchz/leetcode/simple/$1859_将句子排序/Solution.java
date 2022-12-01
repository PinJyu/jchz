package com.jchz.leetcode.simple.$1859_将句子排序;

import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-10 22:51
 * @see
 * @since
 */
public class Solution {
    public String sortSentence(String s) {
        String[] map = new String[10];
        String[] sp = s.split(" ");

        for (String value : sp) {
            int j = value.charAt(value.length() - 1) - '0';
            map[j] = value.substring(0, value.length() - 1);
        }

        StringBuilder sb = new StringBuilder();
        for (String s1 : map) {
            if (s1 != null)
                sb.append(s1).append(" ");
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }
}
