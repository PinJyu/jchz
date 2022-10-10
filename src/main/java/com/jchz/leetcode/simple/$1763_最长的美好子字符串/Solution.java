package com.jchz.leetcode.simple.$1763_最长的美好子字符串;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 17:27
 */
public class Solution {
    public String longestNiceSubstring(String s) {
        char[] cs = s.toCharArray();
        int maxPos = 0, maxLen = 0;
        for (int i = 0; i < cs.length; i++) {
            int lower = 0, upper = 0;
            for (int j = i; j < cs.length; j++) {
                if (cs[j] >= 'a')
                    lower |= 1 << (cs[j] - 'a');
                else
                    upper |= 1 << (cs[j] - 'A');

                if (lower == upper && j - i + 1 > maxLen) {
                    maxPos = i;
                    maxLen = j - i + 1;
                }
            }
        }

        return s.substring(maxPos, maxPos + maxLen);
    }
}


