package com.jchz.leetcode.$0345_反转字符串中的元音字母;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-16 16:35
 */
public class Solution {
    public String reverseVowels(String s) {
        if ("".equals(s)) return s;

        int l = 0, r = s.length() - 1;

        char[] cs = s.toCharArray();
        while (l <= r) {
            while (l <= r && !is(cs[l])) {
                l++;
            }
            while (r >= l && !is(cs[r])) {
                r--;
            }
            if (l <= r) {
                char t = cs[l];
                cs[l] = cs[r];
                cs[r] = t;
                l++;
                r--;
            }
        }
        return new String(cs);
    }

    private boolean is(char c) {
        return c == 'a'
                || c == 'e'
                || c == 'i'
                || c == 'o'
                || c == 'u'
                || c == 'A'
                || c == 'E'
                || c == 'I'
                || c == 'O'
                || c == 'U'
                ;
    }
}
