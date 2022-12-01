package com.jchz.leetcode.simple.$剑指OfferII0019_最多删除一个字符得到回文;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-21 17:34
 */
public class Solution {
    public boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        char[] cs = s.toCharArray();
        while (l < r) {
            if (cs[l] != cs[r])
                return isPalindrome(cs, l, r - 1) || isPalindrome(cs, l + 1, r);

            l++;
            r--;
        }

        return true;
    }

    boolean isPalindrome(char[] cs, int s, int e) {
        while (s < e) {
            if (cs[s] != cs[e])
                return false;
            s++;
            e--;
        }

        return true;
    }
}
