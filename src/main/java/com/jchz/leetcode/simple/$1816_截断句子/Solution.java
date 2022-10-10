package com.jchz.leetcode.simple.$1816_截断句子;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-10 21:50
 * @see
 * @since
 */
public class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        char last = 1;
        for (char c : s.toCharArray()) {
            if (last != ' ' && c == ' ') {
                k--;
                if (k == 0)
                    break;
            }

            sb.append(c);

        }

        return sb.toString();
    }
}
