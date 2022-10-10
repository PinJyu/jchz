package com.jchz.leetcode.simple.$1768_交替合并字符串;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-10 17:47
 */
public class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len = Math.min(word1.length(), word2.length());
        char[] cs1 = word1.toCharArray(), cs2 = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < len; i++) {
            sb.append(cs1[i]).append(cs2[i]);
        }

        char[] remain = cs1.length > cs2.length ? cs1 : cs2;
        for (int i = len; i < remain.length; i++) {
            sb.append(remain[i]);
        }

        return sb.toString();
    }
}
