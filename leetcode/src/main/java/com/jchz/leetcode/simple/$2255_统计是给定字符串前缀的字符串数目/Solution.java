package com.jchz.leetcode.simple.$2255_统计是给定字符串前缀的字符串数目;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-14 17:25
 */
public class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        char[] scs = s.toCharArray();
    outer:
        for (String word : words) {
            char[] cs = word.toCharArray();
            if (cs.length <= s.length()) {
                for (int i = 0; i < cs.length; i++) {
                    if (scs[i] != cs[i])
                        continue outer;
                }
                count++;
            }
        }

        return count;
    }
}
