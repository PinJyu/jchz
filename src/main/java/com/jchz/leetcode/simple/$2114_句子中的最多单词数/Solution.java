package com.jchz.leetcode.simple.$2114_句子中的最多单词数;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-13 22:34
 * @see
 * @since
 */
public class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String sentence : sentences) {
            char[] cs = sentence.toCharArray();
            int count = 0;
            for (char c : cs) {
               if (c == ' ')
                   count++;
            }

            max = Math.max(max, count + 1);
        }

        return max;
    }
}
