package com.jchz.leetcode.$0459_unresolve_重复的子字符串;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-20 14:29
 */
public class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if (s.length() % 2 == 1) return false;

        s = s + s;
        int len = s.length() / 2;

        char[] cs = s.toCharArray();
        for (int i = 0; i < len; i++) {
            if (cs[i] != cs[len + i]) {
                return false;
            }
        }

        return true;
    }
}
