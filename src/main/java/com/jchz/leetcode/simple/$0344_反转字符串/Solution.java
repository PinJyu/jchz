package com.jchz.leetcode.simple.$0344_反转字符串;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-09-16 16:31
 */
public class Solution {
    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1;

        while (l <= r) {
            char t = s[l];
            s[l] = s[r];
            s[r] = t;
            l++;
            r--;
        }

    }
}
