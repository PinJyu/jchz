package com.jchz.leetcode.simple.$2108_找出数组中的第一个回文字符串;

/**
 * Solution
 *
 * @author pyu
 * @version 2022-10-13 22:30
 * @see
 * @since
 */
public class Solution {
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            char[] cs = word.toCharArray();
            int l = 0, r = cs.length - 1;
            while (l < r) {
                if (cs[l] == cs[r]) {
                    l++;
                    r--;
                }
                else break;
            }
            if (l >= r)
                return word;
        }

        return "";
    }
}
