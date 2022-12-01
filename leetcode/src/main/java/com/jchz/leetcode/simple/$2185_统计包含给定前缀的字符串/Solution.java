package com.jchz.leetcode.simple.$2185_统计包含给定前缀的字符串;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 11:16
 */
public class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
    outer:
        for (String word : words) {
            if (word.length() >= pref.length()) {
                char[] cs = word.toCharArray();
                char[] pcs = pref.toCharArray();
                for (int i = 0; i < pcs.length; i++) {
                    if (pcs[i] != cs[i])
                        continue outer;
                }
                count++;
            }
        }

        return count;
    }
}
