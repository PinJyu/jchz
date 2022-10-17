package com.jchz.leetcode.simple.$2000_反转单词前缀;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-12 16:11
 */
public class Solution {
    public String reversePrefix(String word, char ch) {
        char[] cs = word.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] == ch) {
                int l = 0, r = i;
                while (l < r) {
                    char t = cs[l];
                    cs[l] = cs[r];
                    cs[r] = t;
                    l++; r--;
                }

                break;
            }
        }

        return new String(cs);
    }
}
