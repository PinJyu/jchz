package com.jchz.leetcode.simple.$1967_作为子字符串出现在单词中的字符串数目;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-11 19:51
 * @see
 * @since
 */
public class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String s : patterns) {
            if (word.contains(s))
                count++;
        }

        return count;
    }
}
