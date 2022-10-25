package com.jchz.leetcode.simple.$剑指OfferII0018_有效的回文;

/**
 * @author yujianping
 * @description TODO
 * @createTime 2022-10-21 17:13
 */
public class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (l < s.length() && !Character.isLetter(s.charAt(l)) && !Character.isDigit(s.charAt(l))) {
                l++;
            }
            while (r >= 0 && !Character.isLetter(s.charAt(r)) && !Character.isDigit(s.charAt(r))) {
                r--;
            }
            if (l < r && (s.charAt(l) | 32) != (s.charAt(r) | 32))
                return false;

            l++; r--;
        }

        return true;
    }
}
