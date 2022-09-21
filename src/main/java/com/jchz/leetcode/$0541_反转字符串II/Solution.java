package com.jchz.leetcode.$0541_反转字符串II;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-21 18:15
 */
public class Solution {
    public String reverseStr(String s, int k) {
        char[] cs = s.toCharArray();

        for (int i = 0; i < cs.length; i += k << 1) {
            reverse(cs, i, Math.min(i + k, cs.length));
        }

        return new String(cs);
    }

    private void reverse(char[] cs, int begin, int end) {
        int l = begin, r = end - 1;
        while (l < r) {
            char t = cs[l];
            cs[l] = cs[r];
            cs[r] = t;
            l++;
            r--;
        }
    }
}
