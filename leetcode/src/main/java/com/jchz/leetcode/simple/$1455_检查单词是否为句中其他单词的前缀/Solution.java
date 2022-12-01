package com.jchz.leetcode.simple.$1455_检查单词是否为句中其他单词的前缀;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-07 19:27
 * @see
 * @since
 */
public class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] s = sentence.split(" ");
        for (int i = 0; i < s.length; i++) {
            String word = s[i];
            if (word.startsWith(searchWord))
                return i;
        }

        return -1;
    }
}
